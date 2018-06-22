package kbank.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class loginInfo {
	
	private String username;
	private String password;
	private String customerID;

	
	
	public String getCustomerID() {
		return customerID;
	}
	
	@JsonProperty("customerid")
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
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
		return "{\"Response\": \""+"Login Success" +"\","
	
				+"\"customerID\": \""+this.customerID+"\"}";
	}
	

}
