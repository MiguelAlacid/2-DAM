package model;

public class Ciudad {
	private String sCapital;
	private String sCodIne;
	private String sNombre;
	private int tMax;
	private int tMin;
	
	public Ciudad() {
		
	}
	
	public Ciudad(String sCapital, String sCodIne, String sNombre, int tMax, int tMin) {
		this.sCapital = sCapital;
		this.sCodIne = sCodIne;
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
	public String getsCodIne() {
		return sCodIne;
	}
	public void setsCodIne(String sCodIne) {
		this.sCodIne = sCodIne;
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
		return "Ciudad [sCapital=" + sCapital + ", sCodIne=" + sCodIne + ", sNombre=" + sNombre + ", tMax=" + tMax
				+ ", tMin=" + tMin + "]";
	}

	
	
	
	
	
	
	
}
