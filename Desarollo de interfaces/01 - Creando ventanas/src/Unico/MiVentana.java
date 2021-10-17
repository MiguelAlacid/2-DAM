package Unico;
import java.awt.*;
public class MiVentana extends java.awt.Frame {

	public MiVentana() {
		Color FondoVentana = new Color (46, 203, 134);
		Color TextoError = Color.red;
		Color TextoNormal = Color.gray;
		
		setTitle("ejemplo de herencia");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int iAncho = 600;
		int iAlto = 400;
		
		int x = (screenSize.width - iAncho) / 2;
		int y = (screenSize.height - iAlto) / 2;
		
		setBounds(x, y, iAncho, iAlto);
		setVisible(true);
		setBackground(FondoVentana);
		// setForeground();
	}

}
