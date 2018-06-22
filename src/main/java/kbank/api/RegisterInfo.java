package kbank.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterInfo {
	private String IDType;
	private String IDValue;
	private String BankCode;
	private String AccountID;

	public String getIDType() {
		return IDType;
	}

	@JsonProperty("IDType")
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	public String getIDValue() {
		return IDValue;
	}

	@JsonProperty("IDValue")
	public void setIDValue(String iDValue) {
		IDValue = iDValue;
	}

	public String getBankCode() {
		return BankCode;
	}

	@JsonProperty("BankCode")
	public void setBankCode(String bankCode) {
		BankCode = bankCode;
	}

	public String getAccountID() {
		return AccountID;
	}

	@JsonProperty("AccountID")
	public void setAccountID(String accountID) {
		AccountID = accountID;
	}

	public String getAccountName() {
		return AccountName;
	}

	@JsonProperty("AccountName")
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	private String AccountName;

	@Override
	public String toString() {
		return "RegisterInfo [IDType=" + IDType + ", IDValue=" + IDValue + ", BankCode=" + BankCode + ", AccountID="
				+ AccountID + ", AccountName=" + AccountName + "]";
	}

}
