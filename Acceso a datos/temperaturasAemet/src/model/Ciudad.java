package model;

public class Ciudad {
	private String sCapital;
	private int iCodIne;
	private int iCodIneM;
	private String sNombre;
	private int tMax;
	private int tMin;
	
	public Ciudad() {
		
	}
	
	public Ciudad(String sCapital, int iCodIne, int iCodIneM, String sNombre, int tMax, int tMin) {
		this.sCapital = sCapital;
		this.iCodIne = iCodIne;
		this.iCodIneM = iCodIneM;
		this.sNombre = sNombre;
		this.tMax = tMax;
		this.tMin = tMin;
	}

	public String getsCapital() {
		return sCapital;
	}
	public void setsCapital(String sCapital) {
		this.sCapital = sCapital;
	}
	public int getiCodIne() {
		return iCodIne;
	}
	public void setiCodIne(int iCodIne) {
		this.iCodIne = iCodIne;
	}
	public int getiCodIneM() {
		return iCodIneM;
	}
	public void setiCodIneM(int iCodIneM) {
		this.iCodIneM = iCodIneM;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public int gettMax() {
		return tMax;
	}
	public void settMax(int tMax) {
		this.tMax = tMax;
	}
	public int gettMin() {
		return tMin;
	}
	public void settMin(int tMin) {
		this.tMin = tMin;
	}

	@Override
	public String toString() {
		return "Ciudad [sCapital=" + sCapital + ", iCodIne=" + iCodIne + ", iCodIneM=" + iCodIneM + ", sNombre="
				+ sNombre + ", tMax=" + tMax + ", tMin=" + tMin + "]";
	}
	
	
	
	
	
}
