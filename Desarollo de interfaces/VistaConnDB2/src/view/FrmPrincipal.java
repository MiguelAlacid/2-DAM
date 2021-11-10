package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.GridLayout;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	public static  JTextArea txtSql;
	public static JTextArea textArea;


	public FrmPrincipal() {
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 293);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Conex");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JDLogin();
			}
		});
		
		mnNewMenu.add(mntmLogin);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmTest = new JMenuItem("Test");
		mntmTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JDTest();
				
				try {
					dbms.DBOracle.openConn();
					
				} catch (Exception e1) {
				
					JOptionPane.showConfirmDialog(null, "ERROR EN LAS CREEDENCIALES, NO SE PUDO CONECTAR A LA BASE DE DATOS", "ERROR",
							JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
				}
				ctrl.CtrlPrincipal.mostrarCredenciales();
			}
		});
		mnNewMenu.add(mntmTest);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSql = new JTextArea();
		txtSql.setBounds(0, 0, 281, 78);
		contentPane.add(txtSql);
		
		JButton btnEjecutar = new JButton("EJECUTAR");
		btnEjecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.setText(logic.LogDept.getListado());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnEjecutar.setBounds(280, 0, 109, 78);
		contentPane.add(btnEjecutar);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 78, 389, 154);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 1));
		
		textArea = new JTextArea();
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane);
		setVisible(true);
	}
}
