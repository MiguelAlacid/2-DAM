package view;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Coche;

public class FrmPrincipal {

	public static void main(String[] args) {
		org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
		
		SessionFactory conf = new Configuration().configure().buildSessionFactory();
		
		Session session = conf.openSession();
		
		Transaction tx = session.beginTransaction();
		int id = 22;
		List<Coche> listado = session.createQuery("FROM Coche").list();
		listado.forEach(c -> System.out.println(c));
		//Coche c = session.byId(Coche.class).getReference(id);
		//Coche c = session.load(Coche.class, id);
		
		 Coche c = new Coche("SEAT", "IBIZA", 200);
		 session.save(c);
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
