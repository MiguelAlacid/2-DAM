package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.Persona;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.*;

public class frmPrincipal extends JFrame {

	private JPanel contentPane;
	public static JTextField txtTelefono;
	public static JTextField txtNombre;
	public static JList lstNombres;
	private static JLabel lblTelefonos;

	/**
	 * Create the frame.
	 */
	public frmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ABRIR AGENDA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlPrincipal.abrirFichero();
			}
		});
		btnNewButton.setBounds(10, 219, 126, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("GUARDAR AGENDA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlPrincipal.escribirPersonas(ctrl.CtrlPrincipal.aPersonas);
			}
		});
		btnNewButton_1.setBounds(146, 219, 147, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(178, 94, 89, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		txtTelefono.setVisible(false);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sTelefono = txtTelefono.getText();
				String sNombre = txtNombre.getText();
				int iContador = lstNombres.getSelectedIndex();
				
				
				
				Persona oPersona = ctrl.CtrlPrincipal.aPersonas.get(iContador);
				
				oPersona.setsNombre(sNombre);
				oPersona.setsTelefono(sTelefono);
				
				
				
			}
		});
		
		btnGuardar.setBounds(178, 125, 89, 23);
		contentPane.add(btnGuardar);
		btnGuardar.setVisible(false);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGuardar.setVisible(true);
				txtTelefono.setVisible(true);
				txtNombre.setVisible(true);
			}
		});
		btnEditar.setBounds(178, 159, 89, 23);
		contentPane.add(btnEditar);
		
		lblTelefonos = new JLabel();
		lblTelefonos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefonos.setBounds(168, 13, 109, 39);
		contentPane.add(lblTelefonos);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(178, 63, 89, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setVisible(false);
		
		lstNombres = new JList();
		lstNombres.setBounds(10, 50, 126, 142);
		contentPane.add(lstNombres);
		
		lstNombres.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()) {
					int iContador = lstNombres.getSelectedIndex();
					String sTelefono = ctrl.CtrlPrincipal.aPersonas.get(iContador).getsTelefono();
					String sNombre = ctrl.CtrlPrincipal.aPersonas.get(iContador).getsNombre();
					
					lblTelefonos.setText(sTelefono);
					txtNombre.setText(sNombre);
					txtTelefono.setText(sTelefono);
					//System.out.println("hola");
				}
			}
		});
		setVisible(true);
	}
}
