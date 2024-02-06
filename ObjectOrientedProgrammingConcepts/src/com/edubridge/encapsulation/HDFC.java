package com.edubridge.encapsulation;

public class HDFC {
	
	private String Branch;
	private String IFCCode;
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getIFCCode() {
		return IFCCode;
	}
	public void setIFCCode(String iFCCode) {
		IFCCode = iFCCode;
	}
	@Override
	public String toString() {
		return "HDFC [Branch=" + Branch + ", IFCCode=" + IFCCode + "]";
	}
	
	
}
