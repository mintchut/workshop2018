package kbank.connectDB;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kbank.api.BasicInfo;
import kbank.api.LocalTransferInfo;
import kbank.api.loginInfo;
import kbank.connectDB.Object;

public interface Mapper {
	


	@Insert("INSERT INTO Customer(CUSTOMERID ,LOGIN ,PASSWORD ,NAME ,ADDRESS ,PHONENUM ,EMAIL ,CREATEDTM ,UPDATEDTM ) "
		  + "VALUES				 (#{CUSTOMERID}, #{LOGIN}, #{PASSWORD}, #{NAME}, #{ADDRESS}, #{PHONENUM}, #{EMAIL}, GETDATE(), #{UPDATEDTM})")
	public void insertCustomer(Object customers);

	@Select("SELECT CUSTOMERID, LOGIN , PASSWORD, NAME,ADDRESS,PHONENUM ,EMAIL ,CREATEDTM ,UPDATEDTM FROM CUSTOMER WHERE CUSTOMERID=#{CUSTOMERID}")
	public Object selectOne(int CUSTOMERID);
	
	@Select("SELECT CUSTOMERID FROM CUSTOMER WHERE LOGIN=#{username}")
	public int getCustomerId(String username);

	@Select("SELECT * FROM CUSTOMER")
	@Results({ @Result(id = true, property = "CUSTOMERID", column = "CUSTOMERID"),
			@Result(property = "LOGIN", column = "LOGIN"),
			@Result(property = "PASSWORD", column = "PASSWORD"),
			@Result(property = "NAME", column = "NAME"),
			@Result(property = "ADDRESS", column = "ADDRESS"),
			@Result(property = "PHONENUM", column = "PHONENUM"),
			@Result(property = "EMAIL", column = "EMAIL"),
			@Result(property = "CREATEDTM", column = "CREATEDTM"),
			@Result(property = "UPDATEDTM", column = "UPDATEDTM")})
	public List<Object> selecctAllCustomer();
	
	@Select("SELECT * FROM TRANSFERTXN WHERE SENDACCOUNTID = #{aCCOUNTID}")
	public List<ObjectTxn> selecctAllTransaction(String aCCOUNTID);
	
	@Select("SELECT * FROM CUSTOMER WHERE LOGIN = #{username} AND PASSWORD = #{password}")
	public loginInfo login(loginInfo loginInput);

	@Update("UPDATE CUSTOMER SET LOGIN=#{LOGIN}")
	public void updateCustomer(Object customers);

	@Delete("DELETE FROM CUSTOMER WHERE CUSTOMERID=#{CUSTOMERID}")
	public void deleteCustomer(int CUSTOMERID);
	
	@Select("SELECT * FROM CUSTOMER JOIN ACCOUNT ON CUSTOMER.CUSTOMERID = ACCOUNT.CUSTOMERID WHERE CUSTOMER.CUSTOMERID = #{customerID}")
	public BasicInfo basic(int customerID);

	@Select("SELECT BALANCEAMOUNT FROM CUSTOMER JOIN ACCOUNT ON CUSTOMER.CUSTOMERID = ACCOUNT.CUSTOMERID WHERE ACCOUNT.ACCOUNTID = #{SendAccountID}")
	public Double selectBalance(String SendAccountID);

	@Update("UPDATE ACCOUNT SET BALANCEAMOUNT = #{newBalance} WHERE ACCOUNT.ACCOUNTID = #{accountID}")
	public void updateBalance(Objecttrans transData);
	
	
	@Insert("INSERT INTO TRANSFERTXN(TXNTYPE ,TXNSTATE ,TXNNOTE ,FEEAMOUNT ,SUBMITAMOUNT ,NETAMOUNT ,SENDBANKCODE ,SENDACCOUNTID ,AIPID,RECEIVEBANKCODE ,RECEIVEACCOUNTID ,CREATEDTM ) "
			+ "VALUES (#{TXNTYPE} ,#{TXNSTATE} ,#{TXNNOTE} ,#{FEEAMOUNT} ,#{SUBMITAMOUNT} ,#{NETAMOUNT} ,#{SENDBANKCODE} ,#{SENDACCOUNTID},#{AIPID} ,#{RECEIVEBANKCODE} ,#{RECEIVEACCOUNTID} ,GETDATE() )")
		public void insertTransferTxn(ObjectTxn TxnData);

	@Select("SELECT NAME FROM CUSTOMER JOIN ACCOUNT ON CUSTOMER.CUSTOMERID = ACCOUNT.CUSTOMERID WHERE ACCOUNT.ACCOUNTID = #{recAccountID}")
	public String selectName(String recAccountID);

}