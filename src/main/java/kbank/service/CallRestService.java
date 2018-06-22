package kbank.service;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import kbank.api.RegisterInfo;
import kbank.api.loginInfo;
import kbank.connectDB.DAO;
import kbank.connectDB.Mapper;
import kbank.connectDB.ObjectTxn;
import kbank.api.BasicInfo;
import kbank.api.GetPromptPayInfo;
import kbank.api.LocalTransferInfo;

@Service
public class CallRestService {

	private RestTemplate restTemplate = new RestTemplate();
	private DAO selectOne= new DAO();
	private DAO login1= new DAO();	
	private int customerID;

	public String registerInfo(RegisterInfo req) {
		try {
			HttpHeaders header = new HttpHeaders();
			header.add(HttpHeaders.CONTENT_TYPE, "application/json");
			HttpEntity<?> rest = new HttpEntity<Object>(req, header);
			ResponseEntity<String> status = restTemplate.exchange("http://192.168.9.154:8090/interbank/any-id",HttpMethod.POST,rest, String.class);
			return status.getStatusCode().toString();
		} catch(Exception e) {
			return "{\"error\": \""+e.getMessage().toString() +"\"}";
		}
	}

	public GetPromptPayInfo getPromptPay(String type, String value) {
		GetPromptPayInfo respGetP = restTemplate.getForObject("http://192.168.9.154:8090/interbank/any-id/?type="+type+"&value="+value, GetPromptPayInfo.class);
		return respGetP;
	}
	


	public String deletePromptPay(int apid) {
		//restTemplate.delete("http://192.168.9.154:8090/interbank/any-id/"+apid);
		ResponseEntity<String> status = restTemplate.exchange("http://192.168.9.154:8090/interbank/any-id/"+apid,HttpMethod.DELETE,null, String.class);
		return status.getStatusCode().toString();
	}


	public String selectLogin(loginInfo req) {
		try {

		return  login1.selectLogin(req).toString();
		
	} catch(Exception e) {
		return  "{\"Response\": \""+"FAIL" +"\"}";
	}
	}
	
	public String selectBasic(int req) {
		try {
			
		return  login1.selectBasic(req).toString();
		
		} catch(Exception e) {
			return  "{\"Response\": \""+"FAIL" +"\"}";
		}
	}
	


	public String LocalTransferInfo(LocalTransferInfo req) {
		try {
			return login1.transfer(req);
		} catch(Exception e) {
			return "{\"Response\": \""+"FAIL" +"\"}";
		}
	}

	public String InterTransferInfo(LocalTransferInfo req) {
		try {
			return login1.intertransfer(req);
		} catch(Exception e) {
			return "{\"Response\": \""+"FAIL" +"\"}";
		}
	}

	public List<ObjectTxn> selectTransac(String aCCOUNTID) {
		try {
			return login1.transaction(aCCOUNTID);
		} catch(Exception e) {
			return null;
		}
	}
}
