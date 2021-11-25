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
	@Column (name = "POBLACION")
	private String sPoblacion;
	@Column (name = "SUPERFICIE")
	private float fSuperficie;
	@Column (name = "ASEOS")
	private Integer iAseos;
	@Column (name = "ID_CASA")
	private Integer id_casa;
	
	
	
	public Casa(String sPoblacion, float fSuperficie, Integer iAseos) {
		super();
		this.sPoblacion = sPoblacion;
		this.fSuperficie = fSuperficie;
		this.iAseos = iAseos;
	}

	public Casa() {
	}
	
	public Casa( Integer id_casa, String sPoblacion, float fSuperficie, Integer iAseos) {
		super();
		this.sPoblacion = sPoblacion;
		this.fSuperficie = fSuperficie;
		this.iAseos = iAseos;
		this.id_casa = id_casa;
	}
	public String getsPoblacion() {
		return sPoblacion;
	}
	public void setsPoblacion(String sPoblacion) {
		this.sPoblacion = sPoblacion;
	}
	public float getfSuperficie() {
		return fSuperficie;
	}
	public void setfSuperficie(float fSuperficie) {
		this.fSuperficie = fSuperficie;
	}
	public Integer getiAseos() {
		return iAseos;
	}
	public void setiAseos(Integer iAseos) {
		this.iAseos = iAseos;
	}
	public Integer getId_casa() {
		return id_casa;
	}
	public void setId_casa(Integer id_casa) {
		this.id_casa = id_casa;
	}

	@Override
	public String toString() {
		return "Casa [sPoblacion=" + sPoblacion + ", fSuperficie=" + fSuperficie + ", iAseos=" + iAseos + ", id_casa="
				+ id_casa + "]";
	}
	
}
