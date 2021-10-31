package ctrl;

import java.util.ArrayList;

public class ctrlPrincipal {

	public static ArrayList<String> aImagenes = new ArrayList<String>();

	public static int iNumeroRandom;
	public static int max = aImagenes.size();
	public static int iRandom;
	public static int iMinimo = 0;
	public static int iMaximo = 1;
	public static boolean boSacabao = false;
	public static ArrayList<String> aNumeros = new ArrayList<String>();

	// Retorna un número aleatorio entre min (incluido) y max (excluido)
	public static int getRandomArbitrary(int min, int max) {
		int iNumero;
		iNumero = (int) (Math.random() * (max - min) + min);
		return iNumero;

	}

	public static void cargarImagenes() {

		aImagenes.add("images/dracula.png");
		aImagenes.add("images/revolver.png");
		aImagenes.add("images/cemetery.png");
		aImagenes.add("images/sun.png");
		aImagenes.add("images/bat.png");
		aImagenes.add("images/garlic.png");
		aImagenes.add("images/pumpkin.png");
		aImagenes.add("images/religion.png");
		aImagenes.add("");
		aImagenes.add("");
		aImagenes.add("");
		aImagenes.add("");
		aImagenes.add("");

	}

	public static String imagenes() {
		// iRandom = getRandomArbitrary(0, max);
		// aNumeros.add(String.valueOf(iRandom));

		if (boSacabao == false) {
			iRandom = getRandomArbitrary(iMinimo, iMaximo);
			iMinimo++;
			iMaximo++;
			if (iMaximo == 4) {
				boSacabao = true;
			}
		}
		if (boSacabao == true) {
			iRandom = getRandomArbitrary(iMaximo, (aImagenes.size() + 1));
		}

		return aImagenes.get(iNumeroRandom);
	}

	public static String imagenAleatoria() {
		if (view.FrmPrincipal.boDracula == false) {
			iNumeroRandom = (int) (Math.random() * ((aImagenes.size()) - 0) + 0);
		}
		if (view.FrmPrincipal.boDracula == true) {
			aImagenes.remove(iNumeroRandom);
			view.FrmPrincipal.boDracula = false;
			iNumeroRandom = (int) (Math.random() * ((aImagenes.size()) - 0) + 0);
		}
		
		/*if (view.FrmPrincipal.boRevolver == false) {
			iNumeroRandom = (int) (Math.random() * ((aImagenes.size()) - 0) + 0);
		}
		if (view.FrmPrincipal.boRevolver == true) {
			aImagenes.remove(iNumeroRandom);
		}*/

		return aImagenes.get(iNumeroRandom);
	}

	/*
	 * public static boolean recorrerArray(int iRandom) { boolean boExiste = false;
	 * for(int iContador = 0; iContador < omitir.length; iContador++) { if(iRandom
	 * == omitir[iContador]) { boExiste = true;
	 * 
	 * }else {
	 * 
	 * } } return boExiste; }
	 */
}
