package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Casa")
public class Casa implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "miSecuencia", sequenceName="SEQ_CASA", allocationSize = 1)
	@Column (name = "ID_CASA")
	private Integer iIdCasa;
	@Column (name = "CALLE")
	private String sCalle;
	@Column (name = "NUMERO")
	private Integer iNumero;
	@Column (name = "SUPERFICIE")
	private Double dSuperficie;
	
	
	
	public Casa() {
	}
	
	public Casa(String sCalle, Integer iNumero, Double dSuperficie) {
		this.sCalle = sCalle;
		this.iNumero = iNumero;
		this.dSuperficie = dSuperficie;
	}
	public Casa(Integer iIdCasa, String sCalle, Integer iNumero, Double dSuperficie) {
		this.iIdCasa = iIdCasa;
		this.sCalle = sCalle;
		this.iNumero = iNumero;
		this.dSuperficie = dSuperficie;
	}
	public Integer getiIdCasa() {
		return iIdCasa;
	}
	public void setiIdCasa(Integer iIdCasa) {
		this.iIdCasa = iIdCasa;
	}
	public String getsCalle() {
		return sCalle;
	}
	public void setsCalle(String sCalle) {
		this.sCalle = sCalle;
	}
	public Integer getiNumero() {
		return iNumero;
	}
	public void setiNumero(Integer iNumero) {
		this.iNumero = iNumero;
	}
	public Double getdSuperficie() {
		return dSuperficie;
	}
	public void setdSuperficie(Double dSuperficie) {
		this.dSuperficie = dSuperficie;
	}
	@Override
	public String toString() {
		return "Casa [iIdCasa=" + iIdCasa + ", sCalle=" + sCalle + ", iNumero=" + iNumero + ", dSuperficie="
				+ dSuperficie + "]";
	}
	
	
	
	
}
