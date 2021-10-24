package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class coloresDialog extends JDialog {

	public static Color cBackgroundDefault;
	public static Color cForegroundDefault;
	
	private final JPanel contentPanel = new JPanel();

	public coloresDialog() {
		setBounds(100, 100, 450, 368);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTextoPrueba = new JLabel("TEXTO DE PRUEBA");
		lblTextoPrueba.setOpaque(true);
		lblTextoPrueba.setBackground(Color.WHITE);
		lblTextoPrueba.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblTextoPrueba.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoPrueba.setBounds(50, 216, 340, 52);
		contentPanel.add(lblTextoPrueba);
		
		JPanel colores = new JPanel();
		colores.setBounds(50, 47, 153, 142);
		contentPanel.add(colores);
		colores.setLayout(new GridLayout(3,3));
		
		JButton btnRojo = new JButton("");
		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(btnRojo.getBackground());
			}
		});
		
		colores.add(btnRojo);
		btnRojo.setForeground(Color.BLACK);
		btnRojo.setBackground(Color.RED);
		
		
		JButton btnVerde = new JButton("");
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(btnVerde.getBackground());
			}
		});
		btnVerde.setBackground(Color.GREEN);
		colores.add(btnVerde);
		
		JButton btnRosa = new JButton("");
		btnRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(btnRosa.getBackground());
			}
		});
		btnRosa.setBackground(Color.PINK);
		colores.add(btnRosa);
		
		JButton btnAzul = new JButton("");
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(btnAzul.getBackground());
			}
		});
		btnAzul.setBackground(Color.BLUE);
		colores.add(btnAzul);
		
		JButton btnNaranja = new JButton("");
		btnNaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(btnNaranja.getBackground());
			}
		});
		btnNaranja.setBackground(Color.ORANGE);
		colores.add(btnNaranja);
		
		JButton btnMagenta = new JButton("");
		btnMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(btnMagenta.getBackground());
			}
		});
		btnMagenta.setBackground(Color.MAGENTA);
		colores.add(btnMagenta);
		
		JButton btnAmarillo = new JButton("");
		btnAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(btnAmarillo.getBackground());
			}
		});
		btnAmarillo.setBackground(Color.YELLOW);
		colores.add(btnAmarillo);
		
		JButton btnNegro = new JButton("");
		btnNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(btnNegro.getBackground());
			}
		});
		btnNegro.setBackground(Color.BLACK);
		colores.add(btnNegro);
		
		JButton btnBlanco = new JButton("");
		btnBlanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(btnBlanco.getBackground());
			}
		});
		btnBlanco.setBackground(Color.WHITE);
		colores.add(btnBlanco);
		
		JPanel colores2 = new JPanel();
		colores2.setBounds(237, 47, 153, 142);
		contentPanel.add(colores2);
		colores2.setLayout(new GridLayout(3, 3));
		
		JButton btnRojo1 = new JButton("");
		btnRojo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setBackground(btnRojo1.getBackground());
			}
		});
		btnRojo1.setBackground(Color.RED);
		colores2.add(btnRojo1);
		
		JButton btnVerde2 = new JButton("");
		btnVerde2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setBackground(btnVerde2.getBackground());
			}
		});
		btnVerde2.setBackground(Color.GREEN);
		colores2.add(btnVerde2);
		
		JButton btnRosa2 = new JButton("");
		btnRosa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setBackground(btnRosa2.getBackground());
			}
		});
		btnRosa2.setBackground(Color.PINK);
		colores2.add(btnRosa2);
		
		JButton btnAzul2 = new JButton("");
		btnAzul2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setBackground(btnAzul2.getBackground());
			}
		});
		btnAzul2.setBackground(Color.BLUE);
		colores2.add(btnAzul2);
		
		JButton btnNaranja2 = new JButton("");
		btnNaranja2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setBackground(btnNaranja2.getBackground());
			}
		});
		btnNaranja2.setBackground(Color.ORANGE);
		colores2.add(btnNaranja2);
		
		JButton btnMagenta2 = new JButton("");
		btnMagenta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setBackground(btnMagenta2.getBackground());
			}
		});
		btnMagenta2.setBackground(Color.MAGENTA);
		colores2.add(btnMagenta2);
		
		JButton btnAmarillo2 = new JButton("");
		btnAmarillo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setBackground(btnAmarillo2.getBackground());
			}
		});
		btnAmarillo2.setBackground(Color.YELLOW);
		colores2.add(btnAmarillo2);
		
		JButton btnNegro2 = new JButton("");
		btnNegro2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setBackground(btnNegro2.getBackground());
			}
		});
		btnNegro2.setBackground(Color.black);
		colores2.add(btnNegro2);
		
		JButton btnBlanco2 = new JButton("");
		btnBlanco2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setBackground(btnBlanco2.getBackground());
			}
		});
		btnBlanco2.setBackground(Color.WHITE);
		colores2.add(btnBlanco2);
		
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.FrmPrincipal.txtAreaEscritura.setForeground(lblTextoPrueba.getForeground());
				view.FrmPrincipal.txtAreaEscritura.setBackground(lblTextoPrueba.getBackground());
			}
		});
		btnAceptar.setBounds(219, 279, 89, 23);
		contentPanel.add(btnAceptar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cBackgroundDefault = lblTextoPrueba.getBackground();
				cForegroundDefault = lblTextoPrueba.getForeground();
				ctrl.ctrlPrincipal.writeColor();
			}
		});
		btnGuardar.setBounds(318, 279, 89, 23);
		contentPanel.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("FUENTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(88, 13, 80, 23);
		contentPanel.add(lblNewLabel);
		setVisible(true);
	}
}
