package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JPanelProducto extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelProducto() {
		 setLayout(null);
		
		 JLabel lblFoto = new JLabel(new ImageIcon ("/Resources/Images/product.png"));
	        lblFoto.setBounds(30, 45, 154, 154);
	        add(lblFoto);
	        
	        JLabel lblNombreProducto = new JLabel("Nombre producto");
	        lblNombreProducto.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNombreProducto.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblNombreProducto.setBounds(224, 32, 154, 25);
	        add(lblNombreProducto);
	        
	        JLabel lblPrecio = new JLabel("Precio (\u20AC)");
	        lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 15));
	        lblPrecio.setBounds(225, 83, 76, 19);
	        add(lblPrecio);
	        
	        JLabel lblStock = new JLabel("Stock");
	        lblStock.setFont(new Font("Tahoma", Font.BOLD, 15));
	        lblStock.setBounds(230, 180, 42, 19);
	        add(lblStock);
	        
	        JCheckBox chckbxNewCheckBox = new JCheckBox("Fr\u00E1gil");
	        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 15));
	        chckbxNewCheckBox.setBounds(349, 176, 69, 27);
	        add(chckbxNewCheckBox);
	        
	        JButton btnPrimero = new JButton(new ImageIcon ("/Resources/Images/before.png"));
	        btnPrimero.setBounds(10, 246, 30, 30);
	        add(btnPrimero);
	        
	        JButton btnSiguiente = new JButton(new ImageIcon ("/Resources/Images/next-button.png"));
	        btnSiguiente.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            }
	        });
	        btnSiguiente.setBounds(90, 246, 30, 30);
	        add(btnSiguiente);
	        
	        JButton btnUltimo = new JButton(new ImageIcon ("/Resources/Images/before.png"));
	        btnUltimo.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            }
	        });
	        btnUltimo.setBounds(130, 246, 30, 30);
	        add(btnUltimo);
	        
	        JButton btnGuardar = new JButton(new ImageIcon ("/Resources/Images/diskette.png"));
	        btnGuardar.setBounds(271, 246, 30, 30);
	        add(btnGuardar);
	        
	        JButton btnEditar = new JButton(new ImageIcon ("/Resources/Images/edit.png"));
	        btnEditar.setBounds(311, 246, 30, 30);
	        add(btnEditar);
	        
	        JButton btnAnterior = new JButton(new ImageIcon ("/Resources/Images/forward.png"));
	        btnAnterior.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
				}
	        });
	        btnAnterior.setBounds(50, 246, 30, 30);
	        add(btnAnterior);
	        
	        JButton btnBorrar = new JButton(new ImageIcon ("/Resources/Images/waste.png"));
	        btnBorrar.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        btnBorrar.setBounds(347, 246, 30, 30);
	        add(btnBorrar);
	        setVisible(true);
	}
	

}
