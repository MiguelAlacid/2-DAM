package view;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Casa;

public class FrmPrincipal {

	public static void main(String[] args) {
		ctrl.ctrlPrincipal.inicio();
		org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
		
		SessionFactory conf = new Configuration().configure().buildSessionFactory();		
		
		
		Session session = conf.openSession();
		
		Transaction tx = session.beginTransaction();
		int id = 1;
		/*List<Casa> listado = session.createQuery("FROM Coche").list();
		listado.forEach(c -> System.out.println(c));*/
		for(Casa c : ctrl.ctrlPrincipal.aCasaLeida) {
			session.save(c);
		}
		//Coche c = session.byId(Coche.class).getReference(id);
		//Coche c = session.load(Coche.class, id);
		
		 //Casa c = new Casa("SEAT", "IBIZA", 1900);
		// GUARDAR OBJETO session.save(c);
		// BORRAR OBJETO session.delete(c);
		// ACTUALIZAR OBJETO session.update(c);
		//System.out.println(c);
		//session.save(c);
	//	System.out.println("fin programa "+  c.toString());
		
		tx.commit();
		
		session.close();
		
		conf.close();
	}

}
