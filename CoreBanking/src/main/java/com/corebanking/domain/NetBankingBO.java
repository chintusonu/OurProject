package com.corebanking.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="NETBANKING")
public class NetBankingBO {
	@Id
	private Long ACCOUNT_NUMBER;
	@GenericGenerator(name = "gen1", strategy = "sequence", parameters = @Parameter(name = "sequence_name", value = "CIF_NO"))
	@GeneratedValue(generator = "gen1")
	private Long CIF_NUMBER;
	private String BANK;
	private String COUNTRY;
	private String BRANCH_CODE;
	private Long MOBILE;
	private String TX_TYPE;

	@GenericGenerator(name = "user", strategy = "com.corebanking.util.CustomUserIdNetBanking")
	@GeneratedValue(generator = "user")
	private String USER_ID;

	@GenericGenerator(name = "pwd", strategy = "com.corebanking.util.CustomPwdNetBanking")
	@GeneratedValue(generator = "pwd")
	private String PASSWORD;

	public Long getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}

	public void setACCOUNT_NUMBER(Long aCCOUNT_NUMBER) {
		ACCOUNT_NUMBER = aCCOUNT_NUMBER;
	}

	public Long getCIF_NUMBER() {
		return CIF_NUMBER;
	}

	public void setCIF_NUMBER(Long cIF_NUMBER) {
		CIF_NUMBER = cIF_NUMBER;
	}

	public String getBANK() {
		return BANK;
	}

	public void setBANK(String bANK) {
		BANK = bANK;
	}

	public String getCOUNTRY() {
		return COUNTRY;
	}

	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}

	public String getBRANCH_CODE() {
		return BRANCH_CODE;
	}

	public void setBRANCH_CODE(String bRANCH_CODE) {
		BRANCH_CODE = bRANCH_CODE;
	}

	public Long getMOBILE() {
		return MOBILE;
	}

	public void setMOBILE(Long mOBILE) {
		MOBILE = mOBILE;
	}

	public String getTX_TYPE() {
		return TX_TYPE;
	}

	public void setTX_TYPE(String tX_TYPE) {
		TX_TYPE = tX_TYPE;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

}
