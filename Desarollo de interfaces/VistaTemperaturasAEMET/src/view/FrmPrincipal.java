package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblComunidad = new JLabel("Comunidad:");
		lblComunidad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblComunidad.setBounds(61, 56, 74, 14);
		contentPane.add(lblComunidad);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProvincia.setBounds(61, 135, 74, 14);
		contentPane.add(lblProvincia);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCiudad.setBounds(61, 213, 56, 14);
		contentPane.add(lblCiudad);
		
		JLabel lblTemperatura = new JLabel("15");
		lblTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 57));
		lblTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatura.setBounds(80, 256, 173, 84);
		contentPane.add(lblTemperatura);
		
		JCheckBox chckbxGuardar = new JCheckBox("Guardar datos en favoritos");
		chckbxGuardar.setSelected(true);
		chckbxGuardar.setBounds(49, 360, 183, 23);
		contentPane.add(chckbxGuardar);
		
		JComboBox lstComunidad = new JComboBox();
		lstComunidad.setBounds(145, 52, 138, 24);
		contentPane.add(lstComunidad);
		
		JComboBox lstProvincia = new JComboBox();
		lstProvincia.setBounds(145, 131, 138, 24);
		contentPane.add(lstProvincia);
		
		JComboBox lstCiudad = new JComboBox();
		lstCiudad.setBounds(145, 209, 138, 24);
		contentPane.add(lstCiudad);
	}
}
