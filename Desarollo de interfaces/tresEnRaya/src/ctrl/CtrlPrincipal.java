package ctrl;

import java.awt.Image;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CtrlPrincipal {

	public static int [][] matriz = {{0,0,0},{0,0,0},{0,0,0}};
	public static final String sX = "imagenes/favorite.png";
	public static final String sCirculo = "imagenes/circle.png";
	public static boolean boExito;
	public static String sFicha;
	public static int iContador;
	
	public static boolean elegirJugador() {
	
		Random aleatorio = new Random();
		int iRandom = aleatorio.nextInt(2);
		System.out.println(iRandom);
		if(iRandom == 0) {
			boExito = true;
		}else {
			boExito = false;
		}
		
		return boExito;
	}
	
	public static String colocarFichas(int iContadorFila, int iContadorColumna) {
		
		if(iContador != 6) {
			if(boExito == true && matriz[iContadorFila][iContadorColumna] == 0) {
				sFicha = sX;
				matriz[iContadorFila][iContadorColumna] = 1;
				boExito = false;
			}else if(boExito == false && matriz[iContadorFila][iContadorColumna] == 0){
				sFicha = sCirculo;
				matriz[iContadorFila][iContadorColumna] = 2;
				boExito = true;
			}else {
				if(matriz[iContadorFila][iContadorColumna] == 2) {
					sFicha = sCirculo;
				}else {
					sFicha = sX;
				}
				
			}
		}
		
		iContador++;
		
		return sFicha;
	}
	
	public static int contadorFichas() {
		return iContador;
	}
	
	public static int moverFicha(int iContadorFila, int iContadorColumna) {
		int iNumero = 1;
		if(matriz[iContadorFila][iContadorColumna] == 1) {
			iNumero = 1;
		}
		return iNumero;
	}
	
	public static void setearFicha(int iContadorFila, int iContadorColumna, int iNumero, JLabel jlOrigen, JLabel jlDestino) {

		if(matriz[iContadorFila][iContadorColumna] == 0) {
			matriz[iContadorFila][iContadorColumna] = iNumero;
		}
		
		if(iNumero == 1) {
			ImageIcon imgThisImgDestino = new ImageIcon(new ImageIcon("imagenes/favorite.png")
					.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
			jlDestino.setIcon(imgThisImgDestino);
			
			ImageIcon imgThisImgOrigen = new ImageIcon(new ImageIcon("")
					.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
			jlOrigen.setIcon(imgThisImgOrigen);

		}
	}
	
}



