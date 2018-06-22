package kbank.connectDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectToH2MyBatisJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectToH2MyBatisJavaApplication.class, args);
		DAO customerDAO = new DAO();
//		Object selectCustomer = customerDAO.selectOne(1);
//		System.out.format("%5s%5s%10s%5s%10s%5s%10s\n", "ID", "|", "LOGIN" ,"|" , "PASSWORD" ,"|", "Name", "|", "ADDress", "|", "Pnum", "|", "email", "|", "CDTM", "|", "UDTM");
//		System.out.println("-------------------------------------------------------------------------------------------------");
//		System.out.format("%5s%5s%10s%5s%10s%5s%10s\n", selectCustomer.getCUSTOMERID());
		
		
		
//		Object insertCustomer = new Object();
//		insertCustomer.setCUSTOMERID(2);
//		insertCustomer.setLOGIN("Test");
//		insertCustomer.setPASSWORD("Test");
//		insertCustomer.setNAME("password");
//		customerDAO.insertCustomer(insertCustomer);
		
		/*UsersObject updateUsers = new UsersObject();
		updateUsers.setUserId(2);
		updateUsers.setUserName("Test_Change");
		usersDAO.update(updateUsers);*/
		
		//usersDAO.delete(2);
	}
}
