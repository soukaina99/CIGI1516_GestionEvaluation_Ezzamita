package org.sqli.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sqli.entities.HbSessionManager;
import org.sqli.entities.Projet;

@Path("/baps")
public class BAP {

	private final HbSessionManager manager = new HbSessionManager();
	Session session;

	@GET
	@Produces("application/json")
	public List<BAP> getBaps() {
		Session session = manager.factory.openSession();
		Query query = session.createQuery("from BAP");
		return query.list();
	}

	@GET
	@Path("/{idBAP}")
	@Consumes("text/plain")
	@Produces("application/json")
	public BAP getBap(@PathParam("idBAP") int idBAP) {
		session = manager.factory.openSession();
		return session.get(BAP.class, idBAP);
	}
	
	@DELETE
	@Consumes("text/plain")
	public void deleteBap(@QueryParam("idBAP") int idBAP){
		
		session = manager.factory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(session.get(BAP.class, idBAP));
		tr.commit();
		session.close();
		
		
		
		
	}
}
