package kbank.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RegisPromptpayRequest implements Serializable{
	

	private static final long serialVersionUID = 4513872240966050831L;
	private String IDType;
	private String IDValue;
	private String BankCode;
	private String AccountID;
	private String AccountName;
	
	
	@JsonProperty("IDType")
	public void setIDType(String iDType) {
		IDType = iDType;
	}
	@JsonProperty("IDValue")
	public void setIDValue(String iDValue) {
		IDValue = iDValue;
	}
	
	@JsonProperty("BankCode")
	public void setBankCode(String bankCode) {
		BankCode = bankCode;
	}
	@JsonProperty("AccountID")
	public void setAccountID(String accountID) {
		AccountID = accountID;
	}
	@JsonProperty("AccountName")
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public String getIDType() {
		return IDType;
	}
	public String getIDValue() {
		return IDValue;
	}
	public String getBankCode() {
		return BankCode;
	}
	public String getAccountID() {
		return AccountID;
	}
	public String getAccountName() {
		return AccountName;
	}
	
	
}
