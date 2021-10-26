package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.CardLayout;

public class frmPrincipal extends JFrame {

	private JPanel contentPane;
	public static JList lstCategorias;
	public static String sSelectedCategoria;
	public static JPanel center;
	public frmPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel westPanel = new JPanel();
		contentPane.add(westPanel, BorderLayout.WEST);
		
		lstCategorias = new JList();
		lstCategorias.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				JList source = (JList)e.getSource();
				sSelectedCategoria = source.getSelectedValue().toString();
				
				
					JPanelProducto JPanelProducto = new JPanelProducto();
					
					cargarPanel(JPanelProducto);
				
				
			}
		});
		  westPanel.setLayout(new CardLayout(0, 0));
		
		
		  JScrollPane listScrollerFuente = new JScrollPane();
	        listScrollerFuente.setBounds(16, 64, 20, 20);
	        listScrollerFuente.setViewportView(lstCategorias);
	        westPanel.add(listScrollerFuente, "name_185343013109500");
	        
	        
	        center = new JPanel();
	        contentPane.add(center, BorderLayout.CENTER);
	        center.setLayout(new CardLayout(0, 0));
		
	       
	        setVisible(true);
		
		//center.add(view.JPanelPrincipal.panelPrincipal);
	}
	
	public void cargarPanel(JPanel panelProducto) {
		center.removeAll();
		center.add(panelProducto);
		center.repaint();
		center.revalidate();
		center.setVisible(true);
	}
}




