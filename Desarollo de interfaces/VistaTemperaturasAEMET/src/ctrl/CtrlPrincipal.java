package ctrl;

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
	
	public static void inicio() throws Exception {
		sFecha = devolverFecha();
		ctrl.ctrlGestionFchXml.download_AEMET(sFecha);
		
		new view.FrmPrincipal();
		
		
	}
	
	
	public static void rellenarCcAa() {
		
		String sNombre;
		/*for(int iContador = 0; iContador < ctrlGestionFchXml.getInfo().size(); iContador++) {
			
			sNombre = ctrlGestionFchXml.getInfo().get(iContador).getsNombre();
			
			view.FrmPrincipal.lstComunidad.addItem(sNombre);
		}*/
		for(CcAa c : fchXML.getInfo()) {
			
			view.FrmPrincipal.lstComunidad.addItem(c.getsNombre());
		}
	}
	
	public static void rellenarProv(CcAa CCAA) {
		view.FrmPrincipal.lstProvincia.removeAllItems();
		for(Provincia p : CCAA.getProv()) {
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
}
