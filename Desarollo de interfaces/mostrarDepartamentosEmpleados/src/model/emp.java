package model;

public class emp {

	private String sNombre;
	private String sOficio;
	private Integer iSalario;
	private Integer iComm;
	private String sFechaAlta;
	private String sNombreJefe;

	public emp() {
	}

	public emp(String sNombre, String sOficio, Integer iSalario, Integer iComm, String sFechaAlta, String sNombreJefe) {
		this.sNombre = sNombre;
		this.sOficio = sOficio;
		this.iSalario = iSalario;
		this.iComm = iComm;
		this.sFechaAlta = sFechaAlta;
		this.sNombreJefe = sNombreJefe;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsOficio() {
		return sOficio;
	}

	public void setsOficio(String sOficio) {
		this.sOficio = sOficio;
	}

	public Integer getiSalario() {
		return iSalario;
	}

	public void setiSalario(Integer iSalario) {
		this.iSalario = iSalario;
	}

	public Integer getiComm() {
		return iComm;
	}

	public void setiComm(Integer iComm) {
		this.iComm = iComm;
	}

	public String getsFechaAlta() {
		return sFechaAlta;
	}

	public void setsFechaAlta(String sFechaAlta) {
		this.sFechaAlta = sFechaAlta;
	}

	public String getsNombreJefe() {
		return sNombreJefe;
	}

	public void setsNombreJefe(String sNombreJefe) {
		this.sNombreJefe = sNombreJefe;
	}

	@Override
	public String toString() {
		return "emp [sNombre=" + sNombre + ", sOficio=" + sOficio + ", iSalario=" + iSalario + ", iComm=" + iComm
				+ ", sFechaAlta=" + sFechaAlta + ", sNombreJefe=" + sNombreJefe + "]";
	}
	
	

}
