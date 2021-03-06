package com.coxandkings.travel.operations.model.manageofflinebooking.manualpnrsync;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpsClientContext {

	@JsonProperty("clientCurrency")
	String clientCurrency;

	@JsonProperty("clientID")
	String clientID;

	@JsonProperty("clientLanguage")
	String clientLanguage;

	@JsonProperty("clientMarket")
	String clientMarket;

	@JsonProperty("clientType")
	String clientType;

	@JsonProperty("pointOfSale")
	String pointOfSale;

	@JsonProperty("clientIATANumber")
	String clientIATANumber;

	@JsonProperty("clientCallbackAddress")
	String clientCallbackAddress;

	public String getClientCurrency() {
		return clientCurrency;
	}

	public void setClientCurrency(String clientCurrency) {
		this.clientCurrency = clientCurrency;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getClientLanguage() {
		return clientLanguage;
	}

	public void setClientLanguage(String clientLanguage) {
		this.clientLanguage = clientLanguage;
	}

	public String getClientMarket() {
		return clientMarket;
	}

	public void setClientMarket(String clientMarket) {
		this.clientMarket = clientMarket;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getPointOfSale() {
		return pointOfSale;
	}

	public void setPointOfSale(String pointOfSale) {
		this.pointOfSale = pointOfSale;
	}

	public String getClientIATANumber() {
		return clientIATANumber;
	}

	public void setClientIATANumber(String clientIATANumber) {
		this.clientIATANumber = clientIATANumber;
	}

	public String getClientCallbackAddress() {
		return clientCallbackAddress;
	}

	public void setClientCallbackAddress(String clientCallbackAddress) {
		this.clientCallbackAddress = clientCallbackAddress;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("clientCurrency=" + getClientCurrency() + "\n");
		sb.append("clientID=" + getClientID() + "\n");
		sb.append("clientLanguage=" + getClientLanguage() + "\n");
		sb.append("clientMarket=" + getClientMarket() + "\n");
		sb.append("clientType=" + getClientType() + "\n");
		sb.append("pointOfSale=" + getPointOfSale() + "\n");
		sb.append("clientIATANumber=" + getClientIATANumber() + "\n");
		sb.append("clientCallbackAddress=" + getClientCallbackAddress() + "\n");

		return sb.toString();
	}
}