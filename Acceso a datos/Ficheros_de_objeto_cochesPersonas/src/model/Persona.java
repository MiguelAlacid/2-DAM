package model;

import java.io.Serializable;

public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	private String sNombre;
	private byte bEdad;
	private float fPeso;
	
	
	public Persona() {
		this.sNombre = "";
		this.bEdad = 0;
		this.fPeso = 0.0f;
	}
	public Persona(String sNombre, byte bEdad, float fPeso) {
		this.sNombre = sNombre;
		this.bEdad = bEdad;
		this.fPeso = fPeso;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public byte getbEdad() {
		return bEdad;
	}
	public void setbEdad(byte bEdad) {
		this.bEdad = bEdad;
	}
	public float getfPeso() {
		return fPeso;
	}
	public void setfPeso(float fPeso) {
		this.fPeso = fPeso;
	}
	@Override
	public String toString() {
		return "Persona [sNombre=" + sNombre + ", bEdad=" + bEdad + ", fPeso=" + fPeso + "]";
	}
	
	
	
	
}
