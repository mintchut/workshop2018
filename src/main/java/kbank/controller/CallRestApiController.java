package kbank.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kbank.service.CallRestService;

import kbank.api.GetPromptPayInfo;
import kbank.api.LocalTransferInfo;
import kbank.api.RegisterInfo;
import kbank.api.loginInfo;
import kbank.connectDB.Object;
import kbank.connectDB.ObjectTxn;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/kbank")
public class CallRestApiController {
	
	@Autowired
	CallRestService callRestService;
	
	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String login(HttpServletRequest request,@RequestBody loginInfo req) {
		return callRestService.selectLogin(req);
	}
	
	@PostMapping(value = "/basic/{customerID}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String login(HttpServletRequest request,@PathVariable("customerID")int customerID) {
		return callRestService.selectBasic(customerID);
	}
	
	@PostMapping(value = "/transaction/{ACCOUNTID}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<ObjectTxn> selectTransac(HttpServletRequest request,@PathVariable("ACCOUNTID")String ACCOUNTID) {
		return callRestService.selectTransac(ACCOUNTID);
	}
	
	@PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String register(HttpServletRequest request,@RequestBody RegisterInfo req) {
		return  callRestService.registerInfo(req);
	}
	
	@PostMapping(value = "/localtransfer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String localtransfer(HttpServletRequest request,@RequestBody LocalTransferInfo req) {
		return  callRestService.LocalTransferInfo(req);
	}
	
	@PostMapping(value = "/intertransfer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String intertransfer(HttpServletRequest request,@RequestBody LocalTransferInfo req) {
		System.out.println(req.toString());
		return  callRestService.InterTransferInfo(req);
	}
	
	@GetMapping(value="/getPromptPay/{type}/{value}",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public GetPromptPayInfo getPromptPay(HttpServletRequest request,@PathVariable("type")String type,@PathVariable("value")String value) {
		return  callRestService.getPromptPay(type, value);
	}
	
	@DeleteMapping(value="/delete/{type}/{value}")
	public String deletePromptPay(HttpServletRequest request,@PathVariable("type")String type,@PathVariable("value")String value) {
		int apid = callRestService.getPromptPay(type, value).getAIPID();
		return callRestService.deletePromptPay(apid);
	}
	
}
