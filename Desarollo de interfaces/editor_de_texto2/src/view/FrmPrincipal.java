package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame {

	public static JTextArea txtAreaEscritura;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JFrame ventana;

	public FrmPrincipal() {
		ventana = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtAreaEscritura = new JTextArea();
		txtAreaEscritura.setBounds(0, 0, 434, 239);
		contentPane.add(txtAreaEscritura);

		JMenuBar menuBar = new JMenuBar();

		JMenu mnuFormato = new JMenu("Formato");
		
		JMenuItem itemFuente = new JMenuItem("Fuente");
		itemFuente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.FuenteTamannio.cargarFuenteTamannio();
				new fuenteDialog();
				view.fuenteDialog.listFuente.setModel(model.FuenteTamannio.oModelo(model.FuenteTamannio.FUENTE));
				view.fuenteDialog.listTamannio.setModel(model.FuenteTamannio.oModelo(model.FuenteTamannio.TAMANNIO));
				
			}
		});
		JMenuItem itemColores = new JMenuItem("Colores");
		
		JMenu mnuArchivo = new JMenu("Archivo");
		JMenuItem itemNuevo = new JMenuItem("Nuevo");
		itemNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.ctrlPrincipal.fileName = null;
				txtAreaEscritura.setText("");
			}
		});
		JMenuItem itemAbrir = new JMenuItem("Abrir");
		itemAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.ctrlPrincipal.abrirFicheroTexto();
			}
		});
		JMenuItem itemGuardar = new JMenuItem("Guardar");
		itemGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctrl.ctrlPrincipal.fileName != null && !ctrl.ctrlPrincipal.fileName.getName().equals("")) {
					ctrl.ctrlPrincipal.escribirFichero(ctrl.ctrlPrincipal.fileName);
				} else {
					ctrl.ctrlPrincipal.guardarFicheroTexto();

				}

			}

		});
		JMenuItem itemGuardarComo = new JMenuItem("Guardar como");
		itemGuardarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.ctrlPrincipal.guardarFicheroTexto();
			}
		});
		JMenuItem itemSalir = new JMenuItem("Salir");
		itemSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.ctrlPrincipal.salir();

			}
		});

		JMenu mnuAyuda = new JMenu("Ayuda");
		JMenuItem itemManual = new JMenuItem("Manual");
		itemManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new manualDialog();
			}
		});

		JMenuItem itemAcercaDe = new JMenuItem("Acerca de");
		itemAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new acerca_de();
			}
		});

		setJMenuBar(menuBar);
		menuBar.add(mnuArchivo);
		mnuArchivo.add(itemNuevo);
		mnuArchivo.add(itemAbrir);
		mnuArchivo.add(itemGuardar);
		mnuArchivo.add(itemGuardarComo);
		mnuArchivo.addSeparator();
		mnuArchivo.add(itemSalir);
		
		

		menuBar.add(mnuAyuda);
		mnuAyuda.add(itemManual);
		mnuAyuda.add(itemAcercaDe);
		
		menuBar.add(mnuFormato);
		mnuFormato.add(itemFuente);
		mnuFormato.add(itemColores);

		setVisible(true);
	}
}
