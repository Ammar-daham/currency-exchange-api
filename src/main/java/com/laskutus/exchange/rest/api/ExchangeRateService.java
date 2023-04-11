package com.laskutus.exchange.rest.api;

import java.io.IOException;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class ExchangeRateService {

	private static final String EXCHANGE_API_URL = "https://api.apilayer.com/exchangerates_data/convert";

	private final OkHttpClient client = new OkHttpClient();

	@Scheduled(fixedDelay = 60000)
	public Double getExchangeRate(String from, String to, String API_KEY) throws IOException {
		HttpUrl.Builder urlBuilder = HttpUrl.parse(EXCHANGE_API_URL).newBuilder();
		urlBuilder.addQueryParameter("from", from);
		urlBuilder.addQueryParameter("to", to);
		urlBuilder.addQueryParameter("amount", "1");
		System.out.println(urlBuilder);

		Request request = new Request.Builder().url(urlBuilder.build().toString()).header("apikey", API_KEY).build();

		try (Response response = client.newCall(request).execute()) {
			if (!response.isSuccessful()) {
				throw new IOException("Unexpected response code: " + response);
			}

			String responseBody = response.body().string();
			JsonNode jsonNode = new ObjectMapper().readTree(responseBody);
			System.out.println(jsonNode);
			return jsonNode.path("info").path("rate").asDouble();
		}
	}

}
