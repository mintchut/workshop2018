package kbank.api;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TransferRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String AIPID;
	private String SendBankCode;
	private String SendAccountID;
	private BigDecimal Amount;
	
	@JsonProperty("AIPID")
	public void setAIPID(String aIPID) {
		AIPID = aIPID;
	}
	@JsonProperty("SendBankCode")
	public void setSendBankCode(String sendBankCode) {
		SendBankCode = sendBankCode;
	}
	@JsonProperty("SendAccountID")
	public void setSendAccountID(String sendAccountID) {
		SendAccountID = sendAccountID;
	}
	@JsonProperty("Amount")
	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}
	
	

}
