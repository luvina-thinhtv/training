package thinhtv.training.entity;

import java.util.Date;

public class kenToIrai {

	
	public kenToIrai(String status, String keiMei, Date iraiHi, String iraiNo, String iraiREV, String iraiSya,
			String kaitoSya) {
		this.status = status;
		this.keiMei = keiMei;
		this.iraiHi = iraiHi;
		this.iraiNo = iraiNo;
		this.iraiREV = iraiREV;
		this.iraiSya = iraiSya;
		this.kaitoSya = kaitoSya;
	}
	/**ステータス*/
	private String status;
	/**形名*/
	private String keiMei;
	/**依頼日*/
	private Date iraiHi;
	/**依頼NO*/
	private String iraiNo;
	/**依頼REV*/
	private String iraiREV;
	/**依頼者*/
	private String iraiSya;
	/**回答者*/
	private String kaitoSya;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getKeiMei() {
		return keiMei;
	}
	public void setKeiMei(String keiMei) {
		this.keiMei = keiMei;
	}
	public Date getIraiHi() {
		return iraiHi;
	}
	public void setIraiHi(Date iraiHi) {
		this.iraiHi = iraiHi;
	}
	public String getIraiNo() {
		return iraiNo;
	}
	public void setIraiNo(String iraiNo) {
		this.iraiNo = iraiNo;
	}
	public String getIraiREV() {
		return iraiREV;
	}
	public void setIraiREV(String iraiREV) {
		this.iraiREV = iraiREV;
	}
	public String getIraiSya() {
		return iraiSya;
	}
	public void setIraiSya(String iraiSya) {
		this.iraiSya = iraiSya;
	}
	public String getKaitoSya() {
		return kaitoSya;
	}
	public void setKaitoSya(String kaitoSya) {
		this.kaitoSya = kaitoSya;
	}

}
