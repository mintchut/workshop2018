package kbank.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasicInfo {
	
	private String username;
	private String password;
	private String customerID;
	private String name;
	private String phoneNum;
	private String bankCode;
	private String accountID;
	private double balanceAmount;
	
	
	
	public String getCustomerID() {
		return customerID;
	}
	
	@JsonProperty("customerid")
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}
	@JsonProperty("phonenum")
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getBankCode() {
		return bankCode;
	}
	@JsonProperty("bankcode")
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}
	
	@JsonProperty("balanceamount")
	public void setBalanceAmount(double balanceamount) {
		this.balanceAmount = balanceamount;
	}

	public String getUsername() {
		return username;
	}
	
	@JsonProperty("accountid")
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getAccountID() {
		return accountID;
	}
	
	@JsonProperty("username")
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	@JsonProperty("password")
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "{\"name\": \""+this.name+"\","
				+ "\"phoneNum\": \""+this.phoneNum+"\","
				+ "\"BalanceAmount\": \""+this.balanceAmount+"\","
				+ "\"bankCode\": \""+this.bankCode+"\","
				+ "\"accountID\": \""+this.accountID+"\","
				+ "\"customerID\": \""+this.customerID+"\"}";
	}
	

}
