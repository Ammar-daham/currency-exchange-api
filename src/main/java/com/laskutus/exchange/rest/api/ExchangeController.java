package com.laskutus.exchange.rest.api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {
	@Autowired
	private ExchangeRateService exchangeRateService;

	@GetMapping("/exchange_amount")
	public ExchangeResponse getExchangeAmount(@RequestParam String from, @RequestParam String to,
			@RequestParam(required = false, defaultValue = "0.0") Double amount) throws IOException {
		Double exchangeRate = exchangeRateService.getExchangeRate(from, to);
		System.out.println(exchangeRate);
		Double toAmount = amount * exchangeRate;

		return new ExchangeResponse(from, to, exchangeRate, toAmount);
	}
}
