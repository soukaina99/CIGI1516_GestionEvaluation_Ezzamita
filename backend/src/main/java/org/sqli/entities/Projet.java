package org.sqli.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@XmlRootElement
public class Projet  implements  Serializable{
	
	 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 583676144786132428L;
	private int idProjet;
	 private String nomProjet;
	 private Date debut;
	 private Date fin;
	 private String description;
	 private String statut;
	 
	 private List<Encadrant> encadrants=new LinkedList<Encadrant>();
	 private List<Collaborateur> colls=new LinkedList<Collaborateur>();
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE)	
	 public int getIdProjet() {return idProjet;}
	 public void setIdProjet(int idProjet) {this.idProjet = idProjet;}
	
	  public String getNomProjet() {return nomProjet;}
	  public void setNomProjet(String nomProjet) {this.nomProjet = nomProjet;}
	  
	  @JsonIgnore
	  @ManyToMany(cascade=CascadeType.ALL)
	  @JoinTable(joinColumns={@JoinColumn(name="idProjet")},
      inverseJoinColumns={@JoinColumn(name="idEncadrant")})
	  public List<Encadrant> getEncadrants() {return encadrants;}
	  public void setEncadrants(List<Encadrant> encadrants) {this.encadrants = encadrants;}
	  
	  @JsonIgnore
	  @ManyToMany(cascade=CascadeType.ALL)
	  @JoinTable(joinColumns={@JoinColumn(name="idProjet")},
      inverseJoinColumns={@JoinColumn(name="idColl")})
	  public List<Collaborateur> getColls() {return colls;}
	  public void setColls(List<Collaborateur> colls) {this.colls = colls;}
	
	  public Date getDebut() {return debut;}
	  public void setDebut(Date debut) {this.debut = debut;}
	
	 public Date getFin() {return fin;}
	 public void setFin(Date fin) {this.fin = fin;}
	 
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	
	public String getStatut() {return statut;}
	public void setStatut(String statut) {this.statut = statut;}

}
