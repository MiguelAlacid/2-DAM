package ctrl;

import java.awt.event.ItemEvent;
import java.awt.Component;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.CcAa;
import model.Ciudad;
import model.Provincia;

public class CtrlPrincipal {
	public static String sFecha;
	public static ctrlGestionFchXml fchXML = new ctrlGestionFchXml("archivos/aemet.xml");
	public static int iNumeroSelected;
	
	public static void inicio() throws Exception {
		sFecha = devolverFecha();
		ctrl.ctrlGestionFchXml.download_AEMET(sFecha);
		view.FrmPrincipal.aComunidades = ctrl.ctrlGestionFchXml.getInfo();
		new view.FrmPrincipal();
		
		
	}
	
	
	public static void rellenarCcAa() {
		for(CcAa c : fchXML.getInfo()) {
			
			view.FrmPrincipal.lstComunidad.addItem(c.getsNombre());
		}
		
	}
	
	public static void rellenarProv(CcAa CCAA) {
			view.FrmPrincipal.lstProvincia.removeAllItems();
			
		System.out.println("hola");
		for(Provincia p : CCAA.getProv()) {
			System.out.println(p.getsNombre());
			view.FrmPrincipal.lstProvincia.addItem(p.getsNombre());
		}
		
		
	}
	
	public static void rellenarCiudades(Provincia oProvincia) {
	
			view.FrmPrincipal.lstCiudad.removeAllItems();
		
		for(Ciudad c : oProvincia.getCiudad()) {
			view.FrmPrincipal.lstCiudad.addItem(c.getsNombre());
		}
		
	}
	
	public static String devolverFecha() {
        String sHoy = "";

        try {
            DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            sHoy = dft.format(LocalDateTime.now());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sHoy;
    }
	
	public static void listenerComunidad() {
		view.FrmPrincipal.sNombreComunidad = view.FrmPrincipal.lstComunidad.getSelectedItem().toString();
		
		System.out.println(view.FrmPrincipal.sNombreComunidad);
		for(int iContador = 0; iContador < view.FrmPrincipal.aComunidades.size(); iContador++) {
			if(view.FrmPrincipal.aComunidades.get(iContador).getsNombre().equals(view.FrmPrincipal.sNombreComunidad)) {
				view.FrmPrincipal.CCAA = view.FrmPrincipal.aComunidades.get(iContador);
			}
		}
		view.FrmPrincipal.aProvincia = ctrl.ctrlGestionFchXml.getProvincias(view.FrmPrincipal.CCAA.getsId());
		ctrl.CtrlPrincipal.rellenarProv(view.FrmPrincipal.CCAA);
		view.FrmPrincipal.lstProvincia.setSelectedIndex(0);
	}
	
	public static void listenerProv() {
	
		
		view.FrmPrincipal.sNombreProvincia = view.FrmPrincipal.lstProvincia.getSelectedItem().toString();

		for(int iContador = 0; iContador < view.FrmPrincipal.aProvincia.size(); iContador++) {
		
		if(view.FrmPrincipal.aProvincia.get(iContador).getsNombre().equals(view.FrmPrincipal.sNombreProvincia)) {
			view.FrmPrincipal.oProvincia = view.FrmPrincipal.aProvincia.get(iContador);
		}
}
		ctrl.CtrlPrincipal.rellenarCiudades(view.FrmPrincipal.oProvincia);
	}


	public static void listenerComunidad2() {
		System.out.println(view.FrmPrincipal.lstComunidad.getSelectedItem().toString());
		
		view.FrmPrincipal.sNombreComunidad = view.FrmPrincipal.lstComunidad.getSelectedItem().toString();
		
		
		for(int iContador = 0; iContador < view.FrmPrincipal.aComunidades.size(); iContador++) {
			if(view.FrmPrincipal.aComunidades.get(iContador).getsNombre().equals(view.FrmPrincipal.sNombreComunidad)) {
				view.FrmPrincipal.CCAA = view.FrmPrincipal.aComunidades.get(iContador);
			}
		}
		view.FrmPrincipal.aProvincia = ctrl.ctrlGestionFchXml.getProvincias(view.FrmPrincipal.CCAA.getsId());
		rellenarProv(view.FrmPrincipal.CCAA);
		
	}


	public static void listenerProv2() {
		System.out.println("perro");
		System.out.println(view.FrmPrincipal.lstProvincia.getItemAt(iNumeroSelected).toString());
		
		//view.FrmPrincipal.sNombreProvincia = view.FrmPrincipal.lstProvincia.getSelectedItem().toString();
		view.FrmPrincipal.sNombreProvincia = view.FrmPrincipal.lstProvincia.getSelectedItem().toString();
		for(int iContador = 0; iContador < view.FrmPrincipal.aProvincia.size(); iContador++) {
		
		if(view.FrmPrincipal.aProvincia.get(iContador).getsNombre().equals(view.FrmPrincipal.sNombreProvincia)) {
			view.FrmPrincipal.oProvincia = view.FrmPrincipal.aProvincia.get(iContador);
		}
}
		ctrl.CtrlPrincipal.rellenarCiudades(view.FrmPrincipal.oProvincia);
	}



}
