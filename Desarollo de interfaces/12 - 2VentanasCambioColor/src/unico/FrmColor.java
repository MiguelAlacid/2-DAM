package unico;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;

public class FrmColor extends JDialog {

	public FrmColor() {
		setTitle("Gestion de productos");
		setModal(true);
		setBounds(100,100,300,300);
		setLayout(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		crearComponentes();
		setVisible(true);
	}
	private void crearComponentes() {
		JButton btnCrear = new JButton("CREAR");
		btnCrear.setBounds(10,50,80,20);
		add(btnCrear);
		
		
	}
}
