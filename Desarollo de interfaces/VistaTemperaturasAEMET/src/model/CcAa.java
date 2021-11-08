package model;

import java.util.ArrayList;

public class CcAa {

	private String sNombre;
	private String sId;
	private ArrayList<Provincia> prov;
	
	public CcAa() {
		
	}
	
	
	
	public CcAa(String sNombre, String sId, ArrayList<Provincia> prov) {
		this.sNombre = sNombre;
		this.sId = sId;
		this.prov = prov;
	}



	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public ArrayList<Provincia> getProv() {
		return prov;
	}
	public void setProv(ArrayList<Provincia> prov) {
		this.prov = prov;
	}
	@Override
	public String toString() {
		return "CcAa [sNombre=" + sNombre + ", sId=" + sId + ", prov=" + prov + "]";
	}
	
	
	
}
