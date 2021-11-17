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

public class JDialogEmpleado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JLabel lblSalario;
	public static JLabel lblOficio;
	public static JLabel lblNombre;
	public static JLabel lblComision;
	public static JLabel lblFechaAlta;
	public static JLabel lblSetNombre;
	public static JLabel lblSetOficio;
	public static JLabel lblSetSalario;
	public static JLabel lblSetComision;
	public static JLabel lblSetHiredate;
	
	public JDialogEmpleado() {
		setBounds(100, 100, 286, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNombre.setBounds(40, 40, 54, 17);
			contentPanel.add(lblNombre);
		}
		{
			lblOficio = new JLabel("Oficio:");
			lblOficio.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblOficio.setBounds(40, 75, 54, 17);
			contentPanel.add(lblOficio);
		}
		{
			lblSalario = new JLabel("Salario");
			lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSalario.setBounds(40, 110, 54, 17);
			contentPanel.add(lblSalario);
		}
		{
			lblComision = new JLabel("Comision:");
			lblComision.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblComision.setBounds(40, 145, 60, 17);
			contentPanel.add(lblComision);
		}
		{
			lblFechaAlta = new JLabel("Fecha alta:");
			lblFechaAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblFechaAlta.setBounds(40, 180, 81, 14);
			contentPanel.add(lblFechaAlta);
		}
		
		lblSetNombre = new JLabel("");
		lblSetNombre.setBounds(114, 43, 137, 14);
		contentPanel.add(lblSetNombre);
		
		lblSetOficio = new JLabel("");
		lblSetOficio.setBounds(114, 78, 127, 14);
		contentPanel.add(lblSetOficio);
		
		lblSetSalario = new JLabel("");
		lblSetSalario.setBounds(114, 113, 128, 14);
		contentPanel.add(lblSetSalario);
		
		lblSetComision = new JLabel("");
		lblSetComision.setBounds(114, 148, 131, 14);
		contentPanel.add(lblSetComision);
		
		lblSetHiredate = new JLabel("");
		lblSetHiredate.setBounds(114, 182, 127, 14);
		contentPanel.add(lblSetHiredate);
		setVisible(true);
	}
}
