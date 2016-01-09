package org.sqli.entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Projet {
	
	 
	 private int idProjet;
	 private String nomProjet;
	 private Date debut;
	 private Date fin;
	 private List<Encadrant> encadrants=new LinkedList<Encadrant>();
	 private List<Collaborateur> colls=new LinkedList<Collaborateur>();
	
	 public int getIdProjet() {return idProjet;}
	 public void setIdProjet(int idProjet) {this.idProjet = idProjet;}
	
	  public String getNomProjet() {return nomProjet;}
	  public void setNomProjet(String nomProjet) {this.nomProjet = nomProjet;}
	
	 
	  public List<Encadrant> getEncadrants() {return encadrants;}
	  public void setEncadrants(List<Encadrant> encadrants) {this.encadrants = encadrants;}
	
	  
	  public List<Collaborateur> getColls() {return colls;}
	  public void setColls(List<Collaborateur> colls) {this.colls = colls;}
	
	  public Date getDebut() {return debut;}
	  public void setDebut(Date debut) {this.debut = debut;}
	
	 public Date getFin() {return fin;}
	 public void setFin(Date fin) {this.fin = fin;}

}
