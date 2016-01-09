package org.sqli.entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;



public class Collaborateur {
	
	private int idColl;
	private Date dateEmbauche;
	private ManagerRH manager;
	private List<BAP> baps=new LinkedList<BAP>();
	private List<Projet> projets=new LinkedList<Projet>();
	

	public int getIdColl() {return idColl;}
	public void setIdColl(int idColl) {this.idColl = idColl;}
	
	public Date getDateEmbauche() {return dateEmbauche;}
	public void setDateEmbauche(Date dateEmbauche) {this.dateEmbauche = dateEmbauche;}
	

	public ManagerRH getManager() {return manager;}
	public void setManager(ManagerRH manager) {this.manager = manager;}
	

	public List<BAP> getBaps() {return baps;}
	public void setBaps(List<BAP> baps) {this.baps = baps;}
	


	public List<Projet> getProjets() {return projets;}
	public void setProjets(List<Projet> projets) {this.projets = projets;}
	
	

}
