package model;

import java.util.ArrayList;

public class Provincia {
	private String sCcaa;
	private String sNombre;
	private ArrayList<Ciudad> ciudad;
	private int iId;
	
	public Provincia(String sNombre, ArrayList<Ciudad> ciudad, int iId, String sCcaa) {
		this.sNombre = sNombre;
		this.ciudad = ciudad;
		this.iId = iId;
		this.sCcaa = sCcaa;
	}

	public String getsCcaa() {
		return sCcaa;
	}
	public void setsCcaa(String sCcaa) {
		this.sCcaa = sCcaa;
	}
	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public ArrayList<Ciudad> getCiudad() {
		return ciudad;
	}

	public void setCiudad(ArrayList<Ciudad> ciudad) {
		this.ciudad = ciudad;
	}

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	@Override
	public String toString() {
		return "Provincia [sNombre=" + sNombre + ", ciudad=" + ciudad + ", iId=" + iId + "]";
	}
	
	
	
	
	
	
}
