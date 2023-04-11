package com.laskutus.exchange.rest.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExchangeControllerTest {

	@Mock
	private ExchangeRateService exchangeRateService;

	@InjectMocks
	private ExchangeController exchangeController;

	@Test
	public void testGetExchangeAmount() throws IOException {
		// Arrange
		String from = "USD";
		String to = "EUR";
		Double amount = 100.0;
		String apiKey = "test-api-key";
		Double exchangeRate = 0.85;

		when(exchangeRateService.getExchangeRate(from, to, apiKey)).thenReturn(exchangeRate);

		// Act
		ExchangeResponse exchangeResponse = exchangeController.getExchangeAmount(from, to, amount, apiKey);

		// Assert
		assertEquals(from, exchangeResponse.getFromCurrency());
		assertEquals(to, exchangeResponse.getToCurrency());
		assertEquals(exchangeRate, exchangeResponse.getExchangeRate());
		assertEquals(amount * exchangeRate, exchangeResponse.getConvertedAmount());
	}

}
