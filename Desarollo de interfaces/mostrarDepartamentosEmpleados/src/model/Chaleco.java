package model;

public class Chaleco {

	private Integer id_chaleco;
	private Integer iColor;
	private Integer iTalla;
	private float fPrecio;
	private Integer iStock;
	
	
	
	public Chaleco() {
		
	}
	public Chaleco(Integer iColor, Integer iTalla, float fPrecio, Integer iStock) {
		super();
		this.iColor = iColor;
		this.iTalla = iTalla;
		this.fPrecio = fPrecio;
		this.iStock = iStock;
	}
	public Chaleco(Integer id_chaleco, Integer iColor, Integer iTalla, float fPrecio, Integer iStock) {
		super();
		this.id_chaleco = id_chaleco;
		this.iColor = iColor;
		this.iTalla = iTalla;
		this.fPrecio = fPrecio;
		this.iStock = iStock;
	}
	public Integer getId_chaleco() {
		return id_chaleco;
	}
	public void setId_chaleco(Integer id_chaleco) {
		this.id_chaleco = id_chaleco;
	}
	public Integer getiColor() {
		return iColor;
	}
	public void setiColor(Integer iColor) {
		this.iColor = iColor;
	}
	public Integer getiTalla() {
		return iTalla;
	}
	public void setiTalla(Integer iTalla) {
		this.iTalla = iTalla;
	}
	public float getfPrecio() {
		return fPrecio;
	}
	public void setfPrecio(float fPrecio) {
		this.fPrecio = fPrecio;
	}
	public Integer getiStock() {
		return iStock;
	}
	public void setiStock(Integer iStock) {
		this.iStock = iStock;
	}
	@Override
	public String toString() {
		return "Chaleco [id_chaleco=" + id_chaleco + ", iColor=" + iColor + ", iTalla=" + iTalla + ", fPrecio="
				+ fPrecio + ", iStock=" + iStock + "]";
	}
	
	
}
