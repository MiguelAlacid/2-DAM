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

public class fuenteDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public static JList<String> listTamannio;
	public static JList<String> listFuente;

	public fuenteDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 261);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fuente");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel.setBounds(41, 32, 60, 21);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tama\u00F1o");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(176, 36, 67, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Estilo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(328, 38, 46, 14);
		contentPanel.add(lblNewLabel_2);
		
		
		listFuente = new JList<String>();
		JScrollPane scrollPaneFuente = new JScrollPane();
		scrollPaneFuente.setBounds(29, 78, 91, 103);
		scrollPaneFuente.setViewportView(listFuente);
				
		
		listTamannio = new JList<String>();
		JScrollPane scrollPaneTamannio = new JScrollPane();
		scrollPaneTamannio.setBounds(171, 78, 91, 103);
		scrollPaneTamannio.setViewportView(listTamannio);
		
		ButtonGroup bgTipoTraduccion = new ButtonGroup();

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Normal");
		rdbtnNewRadioButton.setBounds(300, 86, 109, 23);
		contentPanel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Negrita");
		rdbtnNewRadioButton_1.setBounds(300, 133, 109, 23);
		contentPanel.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Cursiva");
		rdbtnNewRadioButton_2.setBounds(300, 179, 109, 23);
		contentPanel.add(rdbtnNewRadioButton_2);

		bgTipoTraduccion.add(rdbtnNewRadioButton);
		bgTipoTraduccion.add(rdbtnNewRadioButton_1);
		bgTipoTraduccion.add(rdbtnNewRadioButton_2);
		
		
        contentPanel.add(scrollPaneFuente);
        contentPanel.add(scrollPaneTamannio);
        
        JLabel lblNewLabel_3 = new JLabel("TEXTO DE PRUEBA");
        lblNewLabel_3.setFont(new Font(listFuente.getSelectedValue().toString(), Font.PLAIN, 14));
        lblNewLabel_3.setBounds(106, 214, 137, 14);
        contentPanel.add(lblNewLabel_3);
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
