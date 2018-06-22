package kbank.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocalTransferInfo {

	private String RecAccountID;
	private String SendAccountID;
	private String SendAccountID0;
	private String SendBankCode;
	private Double Amount;
	private String Note;
	private String Type;
	private String AccountId;
	private String IDValue;
	private String AIPID;
	private String RecBankCode;

	public String getAccountId() {
		return AccountId;
	}

	@JsonProperty("AccountId")
	public void setAccountId(String accountId) {
		AccountId = accountId;
	}


	public String getIDValue() {
		return IDValue;
	}

	public void setIDValue(String iDValue) {
		IDValue = iDValue;
	}


	public String getType() {
		return Type;
	}

	@JsonProperty("Type")
	public void setType(String type) {
		Type = type;
	}

	public String getRecBankCode() {
		return RecBankCode;
	}

	@JsonProperty("RecBankCode")
	public void setRecBankCode(String RecBankCode) {
		this.RecBankCode = RecBankCode;
	}


	public String getAIPID() {
		return AIPID;
	}

	@JsonProperty("AIPID")
	public void setAIPID(String aIPID) {
		AIPID = aIPID;
	}

	public String getNote() {
		return Note;
	}

	@JsonProperty("Note")
	public void setNote(String note) {
		Note = note;
	}

	public String getRecAccountID() {
		return RecAccountID;
	}

	@JsonProperty("RecAccountID")
	public void setRecAccountID(String recAccountID) {
		RecAccountID = recAccountID;
	}

	public String getSendAccountID() {
		return SendAccountID;
	}

	@JsonProperty("SendAccountID")
	public void setSendAccountID(String sendAccountID) {
		SendAccountID = sendAccountID;
	}

	public String getSendAccountID0() {
		return SendAccountID0;
	}

	@JsonProperty("SendAccountID0")
	public void setSendAccountID0(String sendAccountID0) {
		SendAccountID0 = sendAccountID0;
	}

	public String getSendBankCode() {
		return SendBankCode;
	}

	@JsonProperty("SendBankCode")
	public void setSendBankCode(String sendBankCode) {
		SendBankCode = sendBankCode;
	}

	public Double getAmount() {
		return Amount;
	}

	@JsonProperty("Amount")
	public void setAmount(Double amount) {
		Amount = amount;
	}

	@Override
	public String toString() {
		return "{\"Amount\": \"" + this.Amount + "\"," + "\"Rec account ID\": \"" + this.AccountId + "\","
				+ "\"Send account ID\": \"" + this.SendAccountID0 + "\"}";
	}

}
