package kbank.api;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TransferResponse implements Serializable{

	private static final long serialVersionUID = 5805576137001101786L;
	private String TxnRefID;
	private LocalDateTime TxnDTM;
	
	@JsonProperty("TxnRefID")
	public void setTxnRefID(String txnRefID) {
		TxnRefID = txnRefID;
	}
	
	@JsonProperty("TxnDTM")
	public void setTxnDTM(LocalDateTime txnDTM) {
		TxnDTM = txnDTM;
	}
	
	

}
