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
	public static JTextArea textArea;
	public static JTextArea txtSql;

	public FrmPrincipal() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 358);
		
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
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		txtSql = new JTextArea();
		txtSql.setRows(3);
		panel_1.add(txtSql);
		
		
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
		panel_1.add(btnEjecutar, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 1));
		
		textArea = new JTextArea();
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane);
		setVisible(true);
	}
}
