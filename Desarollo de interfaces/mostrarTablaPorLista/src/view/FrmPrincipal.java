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
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	public static JTable tableDatos;
	public static JList lstTablas;

	public FrmPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 349);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Conex");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.addActionListener(new ActionListener()  {
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
		
		JPanel panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.CENTER);
		
		JPanel panelTabla = new JPanel();
		contentPane.add(panelTabla, BorderLayout.WEST);
		
		lstTablas = new JList();
		lstTablas.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				try {
					ctrl.CtrlPrincipal.listenerJlist();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lstTablas.setBounds(21, 54, 102, 212);
		JScrollPane scrollPane = new JScrollPane(lstTablas);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		GroupLayout gl_panelTabla = new GroupLayout(panelTabla);
		gl_panelTabla.setHorizontalGroup(
			gl_panelTabla.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTabla.createSequentialGroup()
					.addGap(60)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(93, Short.MAX_VALUE))
		);
		gl_panelTabla.setVerticalGroup(
			gl_panelTabla.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelTabla.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panelTabla.setLayout(gl_panelTabla);
		panelDatos.setLayout(new CardLayout(0, 0));
		
		tableDatos = new JTable();
		tableDatos.setBounds(152, 55, 314, 212);
		JScrollPane scrollPaneDatos = new JScrollPane(tableDatos);
		
		scrollPaneDatos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panelDatos.add(scrollPaneDatos, "name_77180949036500");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblTablas = new JLabel("TABLAS");
		
		JLabel lblDatos = new JLabel("DATOS");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(61)
					.addComponent(lblTablas, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(177)
					.addComponent(lblDatos, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(193, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDatos)
						.addComponent(lblTablas, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		setVisible(true);
	}
}
