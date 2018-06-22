package kbank.api;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@Scope("prototype")
public class GetPromptPayInfo {
	private int AIPID;
	private String IDValue;
	private String IDType;
	private String BankCode;
	private String Status;
	private String AccountID;
	private String AccountName;

	public int getAIPID() {
		return AIPID;
	}

	@JsonProperty("AIPID")
	public void setAIPID(int aIPID) {
		AIPID = aIPID;
	}

	public String getIDValue() {
		return IDValue;
	}

	@JsonProperty("IDValue")
	public void setIDValue(String iDValue) {
		IDValue = iDValue;
	}
	
	public String getIDType() {
		return IDType;
	}

	@JsonProperty("IDType")
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	public String getBankCode() {
		return BankCode;
	}

	@JsonProperty("BankCode")
	public void setBankCode(String bankCode) {
		BankCode = bankCode;
	}

	public String getStatus() {
		return Status;
	}

	@JsonProperty("Status")
	public void setStatus(String status) {
		Status = status;
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

	public String getRegisterDTM() {
		return RegisterDTM;
	}

	@JsonProperty("RegisterDTM")
	public void setRegisterDTM(String registerDTM) {
		RegisterDTM = registerDTM;
	}

	private String RegisterDTM;

	@Override
	public String toString() {
		return "GetPromptPayInfo [AIPID=" + AIPID + ", IDValue=" + IDValue + ", IDType=" + IDType + ", BankCode=" + BankCode + ", Status="
				+ Status + ", AccountID=" + AccountID + ", AccountName=" + AccountName + ", RegisterDTM=" + RegisterDTM
				+ "]";
	}
	
	
}
