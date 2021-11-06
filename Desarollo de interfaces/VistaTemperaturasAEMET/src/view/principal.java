package view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


import ctrl.ctrlGestionFchXml;
import model.CcAa;
import model.Ciudad;
import model.Provincia;

public class principal {

	public static void main(String[] args) {
		
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy-MM-dd");
			String sHoy = dtf.format(LocalDateTime.now());
			ctrl.ctrlGestionFchXml.download_AEMET(sHoy);
		}catch(Exception e) {
			
		}
		String fileName="archivos/pb.xml";
		
		
		ctrlGestionFchXml fchXML = new ctrlGestionFchXml(fileName);
		//ArrayList<CcAa>Ciudades=fchXML.getJugadores();
		
		for(CcAa ca: fchXML.getInfo()) {
			System.out.println("CCAA: " + ca.getsNombre() + ca.getsId()+ ca.getProv());
			for(Provincia p : ca.getProv()) {
				System.out.println("\tPROVINCIA: " + p.getsNombre() + p.getiId() + p.getsCcaa() + p.getCiudad());
				for(Ciudad c: p.getCiudad()) {
					System.out.println("\tCIUDADES: " + c.getsNombre() + c.getiCodIne() + c.getsCapital() + c.gettMin() + c.gettMax());
				}
			}
			
		}
		//fchXML.addJugador(new Jugador(7,"Ramon","Pernia","Pelota",1750));
		//fchXML.saveData();
		fchXML.mostrarDocumento();

	}

}
