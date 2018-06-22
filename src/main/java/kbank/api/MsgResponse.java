package kbank.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MsgResponse implements Serializable{
	
	private static final long serialVersionUID = 524030914109480681L;
	private String StatusCode = "SUCCESS";
	private String StatusDesc;
	
	@JsonProperty("StatusCode")
	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}
	@JsonProperty("StatusDesc")
	public void setStatusDesc(String statusDesc) {
		StatusDesc = statusDesc;
	}
	
	

}
