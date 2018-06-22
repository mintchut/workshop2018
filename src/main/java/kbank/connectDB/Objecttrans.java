package kbank.connectDB;

public class Objecttrans {
	public Objecttrans(String a, Double b) {
		this.setAccountID(a);
		this.setNewBalance(b);
	}

	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public Double getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(Double newBalance) {
		this.newBalance = newBalance;
	}
	private String accountID;
	 private Double newBalance;
}