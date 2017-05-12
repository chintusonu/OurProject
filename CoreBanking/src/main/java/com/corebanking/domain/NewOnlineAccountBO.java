package com.corebanking.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="")
public class NewOnlineAccountBO {

	private Long ACCOUNT_NUMBER;
	private  Long CIf_NUMBER;
	private String BANK_NAME;
	private String COUNTRY_NAME;
	private String BRANCH_NAME;
	private Long MOBILE_NO;
	private String FACILITY_TYPE;
	public Long getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}
	public void setACCOUNT_NUMBER(Long aCCOUNT_NUMBER) {
		ACCOUNT_NUMBER = aCCOUNT_NUMBER;
	}
	public Long getCIf_NUMBER() {
		return CIf_NUMBER;
	}
	public void setCIf_NUMBER(Long cIf_NUMBER) {
		CIf_NUMBER = cIf_NUMBER;
	}
	public String getBANK_NAME() {
		return BANK_NAME;
	}
	public void setBANK_NAME(String bANK_NAME) {
		BANK_NAME = bANK_NAME;
	}
	public String getCOUNTRY_NAME() {
		return COUNTRY_NAME;
	}
	public void setCOUNTRY_NAME(String cOUNTRY_NAME) {
		COUNTRY_NAME = cOUNTRY_NAME;
	}
	public String getBRANCH_NAME() {
		return BRANCH_NAME;
	}
	public void setBRANCH_NAME(String bRANCH_NAME) {
		BRANCH_NAME = bRANCH_NAME;
	}
	public Long getMOBILE_NO() {
		return MOBILE_NO;
	}
	public void setMOBILE_NO(Long mOBILE_NO) {
		MOBILE_NO = mOBILE_NO;
	}
	public String getFACILITY_TYPE() {
		return FACILITY_TYPE;
	}
	public void setFACILITY_TYPE(String fACILITY_TYPE) {
		FACILITY_TYPE = fACILITY_TYPE;
	}
	@Override
	public String toString() {
		return "NewOnlineAccountBO [ACCOUNT_NUMBER=" + ACCOUNT_NUMBER + ", CIf_NUMBER=" + CIf_NUMBER + ", BANK_NAME="
				+ BANK_NAME + ", COUNTRY_NAME=" + COUNTRY_NAME + ", BRANCH_NAME=" + BRANCH_NAME + ", MOBILE_NO="
				+ MOBILE_NO + ", FACILITY_TYPE=" + FACILITY_TYPE + "]";
	}
	
	
	
	

}
