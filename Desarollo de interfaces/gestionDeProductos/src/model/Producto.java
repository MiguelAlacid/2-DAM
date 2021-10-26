package model;

import java.util.ArrayList;

public class Producto {

	public static ArrayList<Producto> aCoches = new ArrayList<Producto>();
	public static ArrayList<Producto> aComida = new ArrayList<Producto>();
	public static ArrayList<Producto> aMoviles = new ArrayList<Producto>();
	
	private String sNombreProducto;
	private float fPrecio;
	private int iStock;
	private boolean boFragil;
	private String sRutaImagen;
	
	public Producto() {
		this.sNombreProducto = "";
		this.fPrecio = 0.0f;
		this.iStock = 0;
		this.boFragil = false;
		this.sRutaImagen = "";
	}
	
	public Producto(String sNombreProducto, float fPrecio, int iStock, boolean boFragil, String sRutaImagen) {
		this.sNombreProducto = sNombreProducto;
		this.fPrecio = fPrecio;
		this.iStock = iStock;
		this.boFragil = boFragil;
		this.sRutaImagen = sRutaImagen;
	}
	public String getsNombreProducto() {
		return sNombreProducto;
	}
	public void setsNombreProducto(String sNombreProducto) {
		this.sNombreProducto = sNombreProducto;
	}
	public float getfPrecio() {
		return fPrecio;
	}
	public void setfPrecio(float fPrecio) {
		this.fPrecio = fPrecio;
	}
	public int getiStock() {
		return iStock;
	}
	public void setiStock(int iStock) {
		this.iStock = iStock;
	}
	public boolean isBoFragil() {
		return boFragil;
	}
	public void setBoFragil(boolean boFragil) {
		this.boFragil = boFragil;
	}
	public String getsRutaImagen() {
		return sRutaImagen;
	}
	public void setsRutaImagen(String sRutaImagen) {
		this.sRutaImagen = sRutaImagen;
	}
	@Override
	public String toString() {
		return "Producto [sNombreProducto=" + sNombreProducto + ", fPrecio=" + fPrecio + ", iStock=" + iStock
				+ ", boFragil=" + boFragil + ", sRutaImagen=" + sRutaImagen + "]";
	}
	
	
	public static void cargarProductos() {
		
		aCoches.add(new Producto("coche1",1000f,100,false,"/imagenes/coche.png"));
		aMoviles.add(new Producto("movil1",250f,100,true,"/imagenes/movil.png"));
		aComida.add(new Producto("comida1",10.50f,20,true,"/imagenes/comida.png"));
	}
}




