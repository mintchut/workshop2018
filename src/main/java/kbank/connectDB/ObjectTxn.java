package kbank.connectDB;

public class ObjectTxn {
	
	//LOCAL
	public ObjectTxn(String tXNTYPE,
			String tXNSTATE,
			String tXNNOTE,
			Double sUBMITAMOUNT,
			Double nETAMOUNT,
			String sENDACCOUNTID,
			String rECEIVEACCOUNTID) {
		this.setTXNTYPE(tXNTYPE);
		this.setTXNSTATE(tXNSTATE);
		this.setTXNNOTE(tXNNOTE);
		this.setFEEAMOUNT(0.0);
		this.setSUBMITAMOUNT(sUBMITAMOUNT);
		this.setNETAMOUNT(nETAMOUNT);
		this.setSENDACCOUNTID(sENDACCOUNTID);
		this.setRECEIVEACCOUNTID(rECEIVEACCOUNTID);
		this.setSENDBANKCODE("004");
		this.setRECEIVEBANKCODE("004");
	}

	//INTERBANK
	public ObjectTxn(String tXNTYPE,
			String tXNSTATE,
			String tXNNOTE,
			Double sUBMITAMOUNT,
			Double nETAMOUNT,
			String sENDACCOUNTID,
			String rECEIVEACCOUNTID,
			String aIPID,
			String sendBC,
			String recBC) {
		this.setTXNTYPE(tXNTYPE);
		this.setTXNSTATE(tXNSTATE);
		this.setTXNNOTE(tXNNOTE);
		this.setFEEAMOUNT(0.0);
		this.setSUBMITAMOUNT(sUBMITAMOUNT);
		this.setNETAMOUNT(nETAMOUNT);
		this.setSENDACCOUNTID(sENDACCOUNTID);
		this.setAIPID(aIPID);
		this.setRECEIVEACCOUNTID(rECEIVEACCOUNTID);
		this.setSENDBANKCODE(sendBC);
		this.setRECEIVEBANKCODE(recBC);
	}
	
	private String TXNTYPE;
	private String TXNSTATE ;
	private String TXNNOTE;
	private Double FEEAMOUNT ;
	private Double SUBMITAMOUNT ;
	private Double NETAMOUNT ;
	private String SENDBANKCODE ;
	private String SENDACCOUNTID ;
	private String AIPID;
	private String RECEIVEBANKCODE;
	private String RECEIVEACCOUNTID;
	
	public String getTXNTYPE() {
		return TXNTYPE;
	}
	public void setTXNTYPE(String tXNTYPE) {
		TXNTYPE = tXNTYPE;
	}
	public String getTXNSTATE() {
		return TXNSTATE;
	}
	public void setTXNSTATE(String tXNSTATE) {
		TXNSTATE = tXNSTATE;
	}
	public String getTXNNOTE() {
		return TXNNOTE;
	}
	public void setTXNNOTE(String tXNNOTE) {
		TXNNOTE = tXNNOTE;
	}
	public Double getFEEAMOUNT() {
		return FEEAMOUNT;
	}
	public void setFEEAMOUNT(Double fEEAMOUNT) {
		FEEAMOUNT = fEEAMOUNT;
	}
	public Double getSUBMITAMOUNT() {
		return SUBMITAMOUNT;
	}
	public void setSUBMITAMOUNT(Double sUBMITAMOUNT) {
		SUBMITAMOUNT = sUBMITAMOUNT;
	}
	public Double getNETAMOUNT() {
		return NETAMOUNT;
	}
	public void setNETAMOUNT(Double nETAMOUNT) {
		NETAMOUNT = nETAMOUNT;
	}
	public String getSENDBANKCODE() {
		return SENDBANKCODE;
	}
	public void setSENDBANKCODE(String sENDBANKCODE) {
		SENDBANKCODE = sENDBANKCODE;
	}
	public String getSENDACCOUNTID() {
		return SENDACCOUNTID;
	}
	public void setSENDACCOUNTID(String sENDACCOUNTID) {
		SENDACCOUNTID = sENDACCOUNTID;
	}
	public String getAIPID() {
		return AIPID;
	}
	public void setAIPID(String aIPID) {
		AIPID = aIPID;
	}
	public String getRECEIVEBANKCODE() {
		return RECEIVEBANKCODE;
	}
	public void setRECEIVEBANKCODE(String rECEIVEBANKCODE) {
		RECEIVEBANKCODE = rECEIVEBANKCODE;
	}
	public String getRECEIVEACCOUNTID() {
		return RECEIVEACCOUNTID;
	}
	public void setRECEIVEACCOUNTID(String rECEIVEACCOUNTID) {
		RECEIVEACCOUNTID = rECEIVEACCOUNTID;
	}
}