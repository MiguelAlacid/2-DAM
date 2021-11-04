package model;

import java.sql.Connection;

public class Login {

	private String sDbHOST;
	private String sDbNAME;
	private String sDbUSER;
	private String sDbPASS;
	
	public Login() {
		
	}
	
	
	public Login(String sDbHOST, String sDbNAME, String sDbUSER, String sDbPASS) {
		this.sDbHOST = sDbHOST;
		this.sDbNAME = sDbNAME;
		this.sDbUSER = sDbUSER;
		this.sDbPASS = sDbPASS;
	}
	
	public String getsDbHOST() {
		return sDbHOST;
	}
	public void setsDbHOST(String sDbHOST) {
		this.sDbHOST = sDbHOST;
	}
	public String getsDbNAME() {
		return sDbNAME;
	}
	public void setsDbNAME(String sDbNAME) {
		this.sDbNAME = sDbNAME;
	}
	public String getsDbUSER() {
		return sDbUSER;
	}
	public void setsDbUSER(String sDbUSER) {
		this.sDbUSER = sDbUSER;
	}
	public String getsDbPASS() {
		return sDbPASS;
	}
	public void setsDbPASS(String sDbPASS) {
		this.sDbPASS = sDbPASS;
	}

	@Override
	public String toString() {
		return "Login [sDbHOST=" + sDbHOST + ", sDbNAME=" + sDbNAME + ", sDbUSER=" + sDbUSER + ", sDbPASS=" + sDbPASS
				+ ", ]";
	}
	

}
