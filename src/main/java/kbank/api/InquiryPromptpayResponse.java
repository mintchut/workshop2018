package kbank.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InquiryPromptpayResponse implements Serializable{
	
	private static final long serialVersionUID = 3758001647158909976L;
	private String AIPID;
	private String IDType;
	private String IDValue;
	private String BankCode;
	private String Status;
	private String AccountID;
	private String AccountName;
	private String RegisterDTM;
	
	@JsonProperty("AIPID")
	public void setAIPID(String aIPID) {
		AIPID = aIPID;
	}
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
	@JsonProperty("Status")
	public void setStatus(String status) {
		Status = status;
	}
	@JsonProperty("AccountID")
	public void setAccountID(String accountID) {
		AccountID = accountID;
	}
	@JsonProperty("AccountName")
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	@JsonProperty("RegisterDTM")
	public void setRegisterDTM(String registerDTM) {
		RegisterDTM = registerDTM;
	}
		
	

}
