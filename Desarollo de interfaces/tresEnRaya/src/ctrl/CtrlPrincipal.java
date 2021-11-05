package ctrl;

import javax.swing.JLabel;

public class CtrlPrincipal {

	public static int [][] matriz = {{0,0,0},{0,0,0},{0,0,0}};
	public static final String sX = "imagenes/favorite.png";
	public static final String sCirculo = "imagenes/circle.png";
	public static boolean boExito;
	public static String sFicha;
	
	public static boolean elegirJugador() {
	
		int iRandom = (int) Math.random() *  (0 + 1) + 1;
		
		if(iRandom == 0) {
			boExito = true;
		}else {
			boExito = false;
		}
		
		return boExito;
	}
	
	public static String colocarFichas(int bContadorFila, int bContadorColumna) {
		
		if(boExito == true && matriz[bContadorFila][bContadorColumna] == 0) {
			sFicha = sX;
			matriz[bContadorFila][bContadorColumna] = 1;
			boExito = false;
		}else if(boExito == false && matriz[bContadorFila][bContadorColumna] == 0){
			sFicha = sCirculo;
			matriz[bContadorFila][bContadorColumna] = 2;
			boExito = true;
		}
		
		return sFicha;
	}
	
	/*public static String meterEnMatriz(JLabel lblImagen) {
		String sFicha = "";
		switch(lblImagen.getText()) {
		case "lblImagen0":
			if(boExito == true) {
				matriz[0][0] = 1;
				sFicha = sX;
			}else {
				matriz[0][0] = 2;
				sFicha = sCirculo;
			}
			break;
		case "lblImagen1":
			if(boExito == true) {
				matriz[0][1] = 1;
				sFicha = sX;
			}else {
				matriz[0][1] = 2;
				sFicha = sCirculo;
			}
			break;
		case "lblImagen2":
			if(boExito == true) {
				matriz[0][2] = 1;
				sFicha = sX;
			}else {
				matriz[0][2] = 2;
				sFicha = sCirculo;
			}
			break;
		case "lblImagen3":
			if(boExito == true) {
				matriz[1][0] = 1;
				sFicha = sX;
			}else {
				matriz[1][0] = 2;
				sFicha = sCirculo;
			}
			break;
		case "lblImagen4":
			if(boExito == true) {
				matriz[1][1] = 1;
				sFicha = sX;
			}else {
				matriz[1][1] = 2;
				sFicha = sCirculo;
			}
			break;
		case "lblImagen5":
			if(boExito == true) {
				matriz[1][2] = 1;
				sFicha = sX;
			}else {
				matriz[1][2] = 2;
				sFicha = sCirculo;
			}
			break;
		case "lblImagen6":
			if(boExito == true) {
				matriz[2][0] = 1;
				sFicha = sX;
			}else {
				matriz[2][0] = 2;
				sFicha = sCirculo;
			}
			break;
		case "lblImagen7":
			if(boExito == true) {
				matriz[2][1] = 1;
				sFicha = sX;
			}else {
				matriz[2][1] = 2;
				sFicha = sCirculo;
			}
			break;
		case "lblImagen8":
			if(boExito == true) {
				matriz[2][2] = 1;
				sFicha = sX;
			}else {
				matriz[2][2] = 2;
				sFicha = sCirculo;
			}
			break;
		}
		return sFicha;
		
	}*/
	
}
