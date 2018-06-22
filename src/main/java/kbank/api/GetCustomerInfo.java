package kbank.api;

import kbank.connectDB.DAO;

public class GetCustomerInfo {
	
	DAO customer = new DAO();
	public void sth() {
		System.out.println(customer.selectOne(1));
	}
}
