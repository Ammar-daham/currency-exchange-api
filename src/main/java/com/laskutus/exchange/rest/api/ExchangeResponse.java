package com.laskutus.exchange.rest.api;

public class ExchangeResponse {
	private String fromCurrency;
	private String toCurrency;
	private Double exchangeRate;
	private Double convertedAmount;

	public ExchangeResponse(String from, String to, Double exchangeRate2, Double toAmount) {
		this.fromCurrency = from;
		this.toCurrency = to;
		this.exchangeRate = exchangeRate2;
		this.convertedAmount = toAmount;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Double getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(Double convertedAmount) {
		this.convertedAmount = convertedAmount;
	}

}