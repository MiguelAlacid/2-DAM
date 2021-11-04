package model;

public class Jugador {

	private String sNombre;
	private String sPuntos;
	
	public Jugador() {
		
	}
	
	public Jugador(String sNombre, String sPuntos) {
		this.sNombre = sNombre;
		this.sPuntos = sPuntos;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public String getsPuntos() {
		return sPuntos;
	}
	public void setsPuntos(String sPuntos) {
		this.sPuntos = sPuntos;
	}
	
	@Override
	public String toString() {
		return "Jugador [sNombre=" + sNombre + ", sPuntos=" + sPuntos + "]";
	}	
	
}
