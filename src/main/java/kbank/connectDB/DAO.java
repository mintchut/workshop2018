package kbank.connectDB;

import java.util.List;
import kbank.service.CallRestService;

import org.apache.ibatis.session.SqlSession;

import kbank.api.BasicInfo;
import kbank.api.LocalTransferInfo;
import kbank.api.loginInfo;
import kbank.connectDB.Mapper;
import kbank.connectDB.Object;
import kbank.service.CallRestService;

public class DAO {
	
	public Object selectOne(int CUSTOMERID) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Mapper Mapper = session.getMapper(Mapper.class);
		Object customers = Mapper.selectOne(CUSTOMERID);
		session.close();
		
		return customers;
	}
	
	public loginInfo selectLogin(loginInfo loginInput) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Mapper Mapper = session.getMapper(Mapper.class);
		loginInfo loginData = Mapper.login(loginInput);
		session.close();
		return loginData;
	}
	
	public List<Object> selectAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Mapper Mapper = session.getMapper(Mapper.class);
		List<Object> customers = Mapper.selecctAllCustomer();
		session.close();
		return customers;
		
	}
	
	
	
	
	

	public void insertCustomer(Object customers) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try{

			Mapper Mapper = session.getMapper(Mapper.class);
			Mapper.insertCustomer(customers);
			session.commit();
			session.close();
		}
		finally{
			
		}
	}

	public void updateCustomer(Object customers) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Mapper Mapper = session.getMapper(Mapper.class);
		Mapper.updateCustomer(customers);
		session.commit();
		session.close();
	}

	public void deleteCustomer(int CUSTOMERID) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Mapper Mapper = session.getMapper(Mapper.class);
		Mapper.deleteCustomer(CUSTOMERID);
		session.commit();
		session.close();
	}
	
	public int getCustomerID(String usr) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Mapper Mapper = session.getMapper(Mapper.class);
		int customerID = Mapper.getCustomerId(usr);
		session.commit();
		session.close();
		return customerID;
	}

	public BasicInfo selectBasic(int customerID) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Mapper Mapper = session.getMapper(Mapper.class);
		BasicInfo basicData = Mapper.basic(customerID);
		session.close();
		return basicData;
	}

	public String transfer(LocalTransferInfo req) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Mapper Mapper = session.getMapper(Mapper.class);
		Double senderBalanceAmount = Mapper.selectBalance(req.getSendAccountID());
		Double receiverBalanceAmount = Mapper.selectBalance(req.getRecAccountID());
		senderBalanceAmount -= req.getAmount();
		receiverBalanceAmount += req.getAmount();
		ObjectTxn TxnSend = new ObjectTxn("S",
				"Complete",
				req.getNote(),
				req.getAmount(),
				req.getAmount(),
				req.getSendAccountID(),
				req.getRecAccountID());
		Mapper.insertTransferTxn(TxnSend);
		ObjectTxn TxnRec = new ObjectTxn("R",
				"Complete",
				req.getNote(),
				req.getAmount(),
				req.getAmount(),
				req.getSendAccountID(),
				req.getRecAccountID());
		Mapper.insertTransferTxn(TxnRec);
		Objecttrans transData = new Objecttrans(req.getSendAccountID(),senderBalanceAmount);
		Objecttrans transData2 = new Objecttrans(req.getRecAccountID(),receiverBalanceAmount);
		String recName= Mapper.selectName(req.getRecAccountID());
		Mapper.updateBalance(transData);
		Mapper.updateBalance(transData2);
		session.commit();
		session.close();
		return "{\"Response\": \""+"SUCCESS" +"\","
		+ "\"recName\": \""+recName +"\"}";
	}
	

	public String intertransfer(LocalTransferInfo req) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Mapper Mapper = session.getMapper(Mapper.class);
		Double senderBalanceAmount = Mapper.selectBalance(req.getSendAccountID0());
		senderBalanceAmount -= req.getAmount();
		ObjectTxn TxnSend = new ObjectTxn("S",
				"Complete",
				req.getNote(),
				req.getAmount(),
				req.getAmount(),
				req.getSendAccountID0(),
				req.getAccountId(),
				req.getAIPID(),
				req.getSendBankCode(),
				req.getRecBankCode());
		System.out.println("check");
		Mapper.insertTransferTxn(TxnSend);
		Objecttrans transData = new Objecttrans(req.getSendAccountID0(),senderBalanceAmount);
		System.out.println(req.getSendAccountID0()+senderBalanceAmount);
		Mapper.updateBalance(transData);
		session.commit();
		session.close();
		
		return "{\"AIPID\": \""+req.getAIPID() +"\","
				+ "\"SendBankCode\": \""+req.getSendBankCode() +"\","
				+ "\"SendAccountID\": \""+req.getSendAccountID0() +"\","
				+ "\"Amount\": \""+req.getAmount() +"\"}";
		

	}

	public List<ObjectTxn> transaction(String aCCOUNTID) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Mapper Mapper = session.getMapper(Mapper.class);
		List<ObjectTxn> transactions = Mapper.selecctAllTransaction(aCCOUNTID);
		session.close();
		System.out.println(transactions);
		return transactions;
	}
}