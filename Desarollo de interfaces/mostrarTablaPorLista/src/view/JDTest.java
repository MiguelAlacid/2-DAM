package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDTest extends JDialog {
	public static JTextField txtPort;
	public static JTextField txtName;
	public static JTextField txtHost;
	private JLabel lblPort;
	private JButton btnAceptar;


	public JDTest() {
		setBounds(100, 100, 345, 245);
		getContentPane().setLayout(null);
		{
			JLabel lblhost = new JLabel("HOST:");
			lblhost.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblhost.setBounds(60, 32, 46, 14);
			getContentPane().add(lblhost);
		}
		{
			lblPort = new JLabel("PORT:");
			lblPort.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblPort.setBounds(60, 78, 46, 14);
			getContentPane().add(lblPort);
		}
		{
			txtHost = new JTextField();
			txtHost.setBounds(116, 30, 155, 20);
			getContentPane().add(txtHost);
			txtHost.setColumns(10);
		}
		{
			txtPort = new JTextField();
			txtPort.setBounds(116, 76, 155, 20);
			getContentPane().add(txtPort);
			txtPort.setColumns(10);
		}
		{
			JLabel lblName = new JLabel("NAME:");
			lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblName.setBounds(60, 126, 46, 14);
			getContentPane().add(lblName);
		}
		{
			txtName = new JTextField();
			txtName.setBounds(116, 124, 155, 20);
			getContentPane().add(txtName);
			txtName.setColumns(10);
		}
		{
			btnAceptar = new JButton("ACEPTAR");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ctrl.CtrlPrincipal.datosBD();
					dbms.DBOracle.escribirFchConfig();
					ctrl.CtrlPrincipal.loginCredenciales = dbms.DBOracle.readConfig();
					dispose();
				}
			});
			btnAceptar.setBounds(116, 164, 89, 23);
			getContentPane().add(btnAceptar);
		}
		setVisible(true);
	}

}
