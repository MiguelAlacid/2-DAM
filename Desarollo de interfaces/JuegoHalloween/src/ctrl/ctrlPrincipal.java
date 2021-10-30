package ctrl;

import java.util.ArrayList;

public class ctrlPrincipal {

	public static ArrayList<String> aImagenes = new ArrayList<String>();
	
	public static int iNumeroRandom;
	
	
	public static void cargarImagenes() {
		
		aImagenes.add("images/dracula.png");
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
	
	public static String imagenAleatoria() {
		if(view.FrmPrincipal.boDracula == true) {
			 iNumeroRandom = (int)(Math.random() *(10-1) + 1);
		}else {
			iNumeroRandom = (int)(Math.random() *(10-0) + 0);
		}
		
		return aImagenes.get(iNumeroRandom);
	}
	
}
