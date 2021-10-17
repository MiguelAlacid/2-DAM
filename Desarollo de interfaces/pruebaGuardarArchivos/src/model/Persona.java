package model;

import java.util.*;

public class Persona {
	private String sNombre;
	private String sTelefono;
	
	public Persona() {
		
	}
	public Persona(String sNombre, String sTelefono) {
		this.setsNombre(sNombre);
		this.setsTelefono(sTelefono);
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public String getsTelefono() {
		return sTelefono;
	}
	public void setsTelefono(String sTelefono) {
		this.sTelefono = sTelefono;
	}
	@Override
	public String toString() {
		return "Persona [sNombre=" + sNombre + ", sTelefono=" + sTelefono + "]";
	}
	
	

}
