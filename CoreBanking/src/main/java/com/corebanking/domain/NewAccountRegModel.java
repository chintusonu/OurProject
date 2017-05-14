package com.corebanking.domain;

public class NewAccountRegModel {
	private String CUSTOMER_TYPE;
	private String RESIDENTIAL_STATUS;
	private String FULL_NAME;
	private String DOB;
	private String GENDER;
	private String NATIONALITY;
	private String COUNTRY;
	private String MOTHER_NAME;
	private Integer UID_NO;
	private NewAccountAddrsBO tempAddress;
	private NewAccountAddrsBO permanentAddress;

	public NewAccountAddrsBO getTempAddress() {
		return tempAddress;
	}

	public void setTempAddress(NewAccountAddrsBO tempAddress) {
		this.tempAddress = tempAddress;
	}

	public NewAccountAddrsBO getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(NewAccountAddrsBO permanentAddress) {
		this.permanentAddress = permanentAddress;
	}


	public String getCUSTOMER_TYPE() {
		return CUSTOMER_TYPE;
	}

	public void setCUSTOMER_TYPE(String cUSTOMER_TYPE) {
		CUSTOMER_TYPE = cUSTOMER_TYPE;
	}

	public String getRESIDENTIAL_STATUS() {
		return RESIDENTIAL_STATUS;
	}

	public void setRESIDENTIAL_STATUS(String rESIDENTIAL_STATUS) {
		RESIDENTIAL_STATUS = rESIDENTIAL_STATUS;
	}

	public String getFULL_NAME() {
		return FULL_NAME;
	}

	public void setFULL_NAME(String fULL_NAME) {
		FULL_NAME = fULL_NAME;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getNATIONALITY() {
		return NATIONALITY;
	}

	public void setNATIONALITY(String nATIONALITY) {
		NATIONALITY = nATIONALITY;
	}

	public String getCOUNTRY() {
		return COUNTRY;
	}

	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}

	public String getMOTHER_NAME() {
		return MOTHER_NAME;
	}

	public void setMOTHER_NAME(String mOTHER_NAME) {
		MOTHER_NAME = mOTHER_NAME;
	}

	public Integer getUID_NO() {
		return UID_NO;
	}

	public void setUID_NO(Integer uID_NO) {
		UID_NO = uID_NO;
	}

}
