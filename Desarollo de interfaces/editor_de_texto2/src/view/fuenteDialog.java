package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class fuenteDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public static JList<String> listTamannio;
	public static JList<String> listFuente;
	public static JRadioButton rdnNormal;
	public static JRadioButton rdnNegrito;
	public static JRadioButton rdnCursiva;
	public static JLabel lblTextoPrueba;
	public static String sSelectedFuente = "Arial";
	public static String sSelectedTamannio = "8";

	public fuenteDialog() {
		
		setBounds(100, 100, 450, 383);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 344);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblFuente = new JLabel("Fuente");
		lblFuente.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblFuente.setBounds(41, 32, 60, 21);
		contentPanel.add(lblFuente);
		
		JLabel tamannio = new JLabel("Tama\u00F1o");
		tamannio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tamannio.setBounds(176, 36, 67, 14);
		contentPanel.add(tamannio);
		
		JLabel lblEstilo = new JLabel("Estilo");
		lblEstilo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEstilo.setBounds(328, 38, 46, 14);
		contentPanel.add(lblEstilo);
		
		
		listFuente = new JList<String>();
		listFuente.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				JList source = (JList)e.getSource();
				
				sSelectedFuente = source.getSelectedValue().toString();
	             ctrl.ctrlPrincipal.cambiarEstilo();
			}
		});
		JScrollPane scrollPaneFuente = new JScrollPane();
		scrollPaneFuente.setBounds(29, 78, 91, 140);
		scrollPaneFuente.setViewportView(listFuente);
				
		
		listTamannio = new JList<String>();
		listTamannio.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				JList source = (JList)e.getSource();
				
	             sSelectedTamannio = source.getSelectedValue().toString();
	             ctrl.ctrlPrincipal.cambiarEstilo();
			}
		});
		JScrollPane scrollPaneTamannio = new JScrollPane();
		scrollPaneTamannio.setBounds(171, 78, 91, 140);
		scrollPaneTamannio.setViewportView(listTamannio);
		
		ButtonGroup bgTipoTraduccion = new ButtonGroup();

		rdnNormal = new JRadioButton("Normal");
		rdnNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.ctrlPrincipal.cambiarEstilo();
			}
		});
		rdnNormal.setBounds(300, 86, 109, 23);
		contentPanel.add(rdnNormal);

		rdnNegrito = new JRadioButton("Negrita");
		rdnNegrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.ctrlPrincipal.cambiarEstilo();
			}
		});
		rdnNegrito.setBounds(300, 133, 109, 23);
		contentPanel.add(rdnNegrito);

		rdnCursiva = new JRadioButton("Cursiva");
		rdnCursiva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.ctrlPrincipal.cambiarEstilo();
			}
		});
		rdnCursiva.setBounds(300, 179, 109, 23);
		contentPanel.add(rdnCursiva);

		bgTipoTraduccion.add(rdnNormal);
		bgTipoTraduccion.add(rdnNegrito);
		bgTipoTraduccion.add(rdnCursiva);
		
		
        contentPanel.add(scrollPaneFuente);
        contentPanel.add(scrollPaneTamannio);
        
        lblTextoPrueba = new JLabel("TEXTO DE PRUEBA");
        lblTextoPrueba.setHorizontalAlignment(SwingConstants.CENTER);
        lblTextoPrueba.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTextoPrueba.setBounds(29, 224, 355, 74);
        contentPanel.add(lblTextoPrueba);
        
        JButton btnNewButton = new JButton("Aceptar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        btnNewButton.setBounds(225, 297, 89, 23);
        contentPanel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Cancelar");
        btnNewButton_1.setBounds(328, 297, 89, 23);
        contentPanel.add(btnNewButton_1);
        setVisible(true);
        
		/* List<String> labels = new ArrayList<>(25);
         for (int index = 0; index < 100; index++) {
             labels.add("Item " + index);
         }*/

       /* final JList<String> listArea = new JList<String>(labels.toArray(new String[labels.size()]));
        listArea.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listArea.setFont(new Font("Serif", Font.ITALIC, 14));
        JScrollPane listScroller = new JScrollPane();
        listScroller.setViewportView(listArea);
        listArea.setLayoutOrientation(JList.VERTICAL);*/

		
		
		//contentPanel.add(listFuente);
	}
}
