package model;

public class Empleado implements infoEmpleado{

	String sNombre, sApellidos, sEmail;
	int iEdad;
	double dSueldo;
	long lTelefono;

	public Empleado() {

	}

	public Empleado(String sNombre, String sApellidos, long lTelefono, String sEmail,int iEdad, double dSueldo) {
		this.sNombre = sNombre;
		this.sApellidos = sApellidos;
		this.sEmail = sEmail;
		this.iEdad = iEdad;
		this.dSueldo = dSueldo;
		this.lTelefono = lTelefono;
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

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public int getiEdad() {
		return iEdad;
	}

	public void setiEdad(int iEdad) {
		this.iEdad = iEdad;
	}

	public double getdSueldo() {
		return dSueldo;
	}

	public void setdSueldo(double dSueldo) {
		this.dSueldo = dSueldo;
	}

	public long getlTelefono() {
		return lTelefono;
	}

	public void setlTelefono(long lTelefono) {
		this.lTelefono = lTelefono;
	}

	@Override
	public String toString() {
		return "Empleado [sNombre=" + sNombre + ", sApellidos=" + sApellidos + ", sEmail=" + sEmail + ", iEdad=" + iEdad
				+ ", dSueldo=" + dSueldo + ", lTelefono=" + lTelefono + "]";
	}

}
