package org.sqli.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sqli.entities.Admin;
import org.sqli.entities.Collaborateur;
import org.sqli.entities.Encadrant;
import org.sqli.entities.HbSessionManager;
import org.sqli.entities.ManagerRH;
import org.sqli.entities.Projet;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collaborateur coll1=new Collaborateur();
		coll1.setNomColl("coll1");
		coll1.setPrenomColl("coll11");
		
		Collaborateur coll2=new Collaborateur();
		coll1.setNomColl("coll2");
		coll1.setPrenomColl("coll22");
		
		Collaborateur coll3=new Collaborateur();
		coll1.setNomColl("coll3");
		coll1.setPrenomColl("coll33");
		
		ManagerRH man=new ManagerRH();
		man.getColls().add(coll1);
		man.getColls().add(coll2);
		man.getColls().add(coll3);
		
		coll1.setManager(man);
		coll2.setManager(man);
		coll3.setManager(man);
	
		HbSessionManager manager = new HbSessionManager();
		Session session = manager.factory.openSession();
	
		Transaction tr = session.beginTransaction();
		Projet pr1=new Projet();
		Projet pr2=new Projet();
		Projet pr3=new Projet();
		Projet pr4=new Projet();
		
		Encadrant enc=new Encadrant();
		
		
		
		pr1.getColls().add(coll1);
		pr1.getColls().add(coll3);
		pr1.getColls().add(coll2);
		pr1.getEncadrants().add(enc);
		
		pr1.setStatut("active");
		pr2.setStatut("active");
		pr3.setStatut("active");
		pr4.setStatut("active");
		
		session.save(man);
	    session.save(coll1);
	    session.save(coll3);
	    session.save(coll2);
	    session.save(enc);
	    session.save(pr4);
	    session.save(pr3);
	    session.save(pr2);
	    session.save(pr1);
		
		tr.commit();
	}

}
