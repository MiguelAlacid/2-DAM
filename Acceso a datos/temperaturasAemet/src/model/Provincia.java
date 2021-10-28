package model;

import java.util.ArrayList;

public class Provincia {
	private String sNombre;
	private ArrayList<Ciudad> ciudad;
	private int iId;
	
	public Provincia(String sNombre, ArrayList<Ciudad> ciudad, int iId) {
		super();
		this.sNombre = sNombre;
		this.ciudad = ciudad;
		this.iId = iId;
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
