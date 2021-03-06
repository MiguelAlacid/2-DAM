package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmConfig extends JFrame {

	private JPanel contentPane;
	public static JTextField txtNumeroPalabras;
	public static JButton btnAceptar;
	public static JRadioButton rdbtnNewRadioButton;
	public static JRadioButton rdbtnNewRadioButton_1;
	public static JRadioButton rdbtnNewRadioButton_2;
	public static JCheckBox chTotalPalabras ;

	/**
	 * Create the frame.
	 */
	public frmConfig() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		chTotalPalabras = new JCheckBox("TOTAL MAX PALABRAS: ");
		chTotalPalabras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumeroPalabras.setEnabled(true);
			}
		});
		chTotalPalabras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chTotalPalabras.setBounds(58, 22, 181, 23);
		contentPane.add(chTotalPalabras);

		txtNumeroPalabras = new JTextField();
		txtNumeroPalabras.setEnabled(false);
		txtNumeroPalabras.setBounds(273, 25, 61, 20);
		contentPane.add(txtNumeroPalabras);
		txtNumeroPalabras.setColumns(10);

		JLabel lblModoPregunta = new JLabel("Modo pregunta:");
		lblModoPregunta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblModoPregunta.setBounds(49, 68, 133, 23);
		contentPane.add(lblModoPregunta);
		
		ButtonGroup bgTipoTraduccion = new ButtonGroup();

		rdbtnNewRadioButton = new JRadioButton("ESP -> ING");
		rdbtnNewRadioButton.setBounds(58, 108, 109, 23);
		contentPane.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("ING -> ESP");
		rdbtnNewRadioButton_1.setBounds(58, 134, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2 = new JRadioButton("indiferente");
		rdbtnNewRadioButton_2.setBounds(58, 160, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);

		bgTipoTraduccion.add(rdbtnNewRadioButton);
		bgTipoTraduccion.add(rdbtnNewRadioButton_1);
		bgTipoTraduccion.add(rdbtnNewRadioButton_2);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(141, 190, 143, 34);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.CtrlPrincipal.inicio();
			}
		});
		contentPane.add(btnAceptar);
		setVisible(true);

	}
}
