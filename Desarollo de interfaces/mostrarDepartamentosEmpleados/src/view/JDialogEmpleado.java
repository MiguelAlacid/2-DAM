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
	
	public JDialogEmpleado() {
		setBounds(100, 100, 286, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNombre.setBounds(40, 40, 54, 17);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblNewLabel = new JLabel("Oficio:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(40, 75, 54, 17);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblSalario = new JLabel("Salario");
			lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSalario.setBounds(40, 110, 54, 17);
			contentPanel.add(lblSalario);
		}
		{
			JLabel lblComision = new JLabel("Comision:");
			lblComision.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblComision.setBounds(40, 145, 60, 17);
			contentPanel.add(lblComision);
		}
		{
			JLabel lblFechaAlta = new JLabel("Fecha alta:");
			lblFechaAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblFechaAlta.setBounds(40, 180, 81, 14);
			contentPanel.add(lblFechaAlta);
		}
	}
}
