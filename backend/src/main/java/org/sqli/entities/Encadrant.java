package org.sqli.entities;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Encadrant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5639506874494462348L;
	private int idEncadrant;
	private List<Projet> projets=new LinkedList<Projet>();


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getIdEncadrant() {return idEncadrant;}
	public void setIdEncadrant(int idEncadrant) {this.idEncadrant = idEncadrant;}
	
	  @ManyToMany
	  @JoinTable(joinColumns={@JoinColumn(name="idEncadrant")},
      inverseJoinColumns={@JoinColumn(name="idProjet")})
	public List<Projet> getProjets() {return projets;}
	public void setProjets(List<Projet> projets) {this.projets = projets;}
	
}
