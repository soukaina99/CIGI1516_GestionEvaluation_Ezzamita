package org.sqli.service;

import java.sql.Date;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sqli.entities.*;

    @Path("/projects")
    public class ProjectRessources extends Application {
	private final HbSessionManager manager = new HbSessionManager();
	Session session;

	@GET
	@Produces("application/json")	
	public List<Projet> getProjects() {
		 session = manager.factory.openSession();
		Query query = session.createQuery("from Projet");
		return query.list();
	}


	@GET
	@Path("/projectsByDate")
	@Produces("application/json")	
	public List<Projet> getProject_by_date( @QueryParam("start") Date start,
			@QueryParam("end") Date end) {
		Session session = manager.factory.openSession();
		Query query = session.createQuery("from Projet where debut>=:start and  fin<=:end");
		query.setDate(1, start);
		query.setDate(2, end);
		return query.list();
	}
	
	
	@GET
	@Path("/{idProjet}")
	@Consumes("text/plain")
	@Produces("application/json")
	public Projet getProjet(@PathParam("idProjet") int idProjet) {
		session = manager.factory.openSession();

		return session.get(Projet.class, idProjet);
	}

	@POST
	@Consumes("application/json")
	public Projet addProject(Projet pr) {
		session = manager.factory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(pr);
		tr.commit();
		session.close();
		return pr;
	}

	@DELETE
	@Consumes("text/plain")
	public void deleteProjet(@QueryParam("idProjet") int idProjet) {
		session = manager.factory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(session.get(Projet.class, idProjet));
		tr.commit();
		session.close();
	}
	
	@PUT
	@Consumes("application/json")
	public void updateProjet(Projet projet){
		session = manager.factory.openSession();
		Transaction tr = session.beginTransaction();
		session.update("Projet", projet);
		tr.commit();
		session.close();
	}
	
	
}
