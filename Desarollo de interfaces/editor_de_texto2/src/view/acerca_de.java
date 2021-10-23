package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class acerca_de extends JDialog {

	public acerca_de() {
		setBounds(100, 100, 341, 200);
		getContentPane().setLayout(null);
		{
			JLabel lblFoto = new JLabel(new ImageIcon ("imagenes\\EditorDeTexto.png"));
			lblFoto.setBounds(20, 21, 85, 89);
			getContentPane().add(lblFoto);
		}
		{
			JLabel lblNombreApp = new JLabel("Editor de texto");
			lblNombreApp.setFont(new Font("Tahoma", Font.BOLD, 21));
			lblNombreApp.setBounds(133, 21, 168, 26);
			getContentPane().add(lblNombreApp);
		}
		{
			JLabel lblVersion = new JLabel("Version 1.0");
			lblVersion.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblVersion.setBounds(133, 58, 168, 26);
			getContentPane().add(lblVersion);
		}
		{
			JLabel lblAutor = new JLabel("Autor: Miguel Alacid Cepeda");
			lblAutor.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblAutor.setBounds(133, 95, 207, 26);
			getContentPane().add(lblAutor);
		}
		setModal(true);
		setVisible(true);
	}

}
