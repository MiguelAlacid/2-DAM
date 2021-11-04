package ctrl;

public class CtrlPrincipal {

	public static int [][] matriz = {{0,0,0},{0,0,0},{0,0,0}};
	public static final String sX = "imagenes/favorite.png";
	public static final String sCirculo = "imagenes/circle.png";
	public static boolean boExito;
	
	public static boolean elegirJugador() {
	
		int iRandom = (int) Math.random() *  (0 + 1) + 1;
		
		if(iRandom == 0) {
			boExito = true;
		}else {
			boExito = false;
		}
		
		return boExito;
	}
	
	public static String colocarFichas() {
		String sFicha="";
		
		if(boExito == true) {
			sFicha = sX;
			boExito = false;
		}else {
			sFicha = sCirculo;
			boExito = true;
		}
		
		return sFicha;
	}
	
}
