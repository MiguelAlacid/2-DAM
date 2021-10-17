package unico;

public class Persona {
	private String sNombre, sApellidos;
	private byte bEdad;

	
	public Persona () {
		
	}
	public Persona (String sNombre, String sApellidos, byte bEdad) {
		this.setsNombre(sNombre);
		this.setsApellidos(sApellidos);
		this.setbEdad(bEdad);
	}
	
	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsApellidos() {
		return sApellidos;
	}

	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}

	public byte getbEdad() {
		return bEdad;
	}

	public void setbEdad(byte bEdad) {
		this.bEdad = bEdad;
	}
	@Override
	public String toString() {
		return "Persona [sNombre=" + sNombre + ", sApellidos=" + sApellidos + ", bEdad=" + bEdad + "]";
	}
	

}
