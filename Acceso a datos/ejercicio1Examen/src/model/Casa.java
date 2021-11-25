package model;

import java.io.Serializable;

public class Casa implements Serializable{

	
	private String sPoblacion;
	private float fSuperficie;
	private Integer iAseos;
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
	
	
	
}
