package org.sqli.entities;

import java.util.LinkedList;
import java.util.List;


public class Encadrant {

	private int idEncadrant;
	private List<Projet> projets=new LinkedList<Projet>();



	public int getIdEncadrant() {return idEncadrant;}
	public void setIdEncadrant(int idEncadrant) {this.idEncadrant = idEncadrant;}
	
	public List<Projet> getProjets() {return projets;}
	public void setProjets(List<Projet> projets) {this.projets = projets;}
	
}
