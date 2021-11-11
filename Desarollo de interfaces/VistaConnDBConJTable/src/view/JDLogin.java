package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDLogin extends JDialog {
	public static  JTextField txtUser;
	public static  JTextField txtPass;

	public JDLogin() {
		setBounds(100, 100, 336, 204);
		getContentPane().setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(141, 30, 86, 20);
		getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setBounds(141, 65, 86, 20);
		getContentPane().add(txtPass);
		txtPass.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsuario.setBounds(70, 30, 61, 14);
		getContentPane().add(lblUsuario);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(70, 67, 71, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlPrincipal.loginCredenciales();
				dbms.DBOracle.escribirFchConfig();
				ctrl.CtrlPrincipal.loginCredenciales = dbms.DBOracle.readConfig();
				dispose();
			}
		});
		btnAceptar.setBounds(115, 118, 89, 23);
		getContentPane().add(btnAceptar);
		setVisible(true);
	}
}
