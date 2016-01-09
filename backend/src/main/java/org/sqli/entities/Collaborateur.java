package org.sqli.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Access(AccessType.PROPERTY)
public class Collaborateur implements Serializable {
	
	
	private static final long serialVersionUID = 2403697822176394724L;
	private int idColl;
	private String nomColl;
	private String prenomColl;
	private String image;
	private Date dateEmbauche;
	private ManagerRH manager;
	private List<BAP> baps=new LinkedList<BAP>();
	private List<Projet> projets=new LinkedList<Projet>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getIdColl() {return idColl;}
	public void setIdColl(int idColl) {this.idColl = idColl;}
	
	public Date getDateEmbauche() {return dateEmbauche;}
	public void setDateEmbauche(Date dateEmbauche) {this.dateEmbauche = dateEmbauche;}
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="idManagerRH")
	public ManagerRH getManager() {return manager;}
	public void setManager(ManagerRH manager) {this.manager = manager;}
	
	@OneToMany(targetEntity=BAP.class,mappedBy="coll")
	public List<BAP> getBaps() {return baps;}
	public void setBaps(List<BAP> baps) {this.baps = baps;}
	
	
	  @JsonIgnore
	  @ManyToMany
	  @JoinTable(joinColumns={@JoinColumn(name="idColl")},
      inverseJoinColumns={@JoinColumn(name="idProjet")})
	  public List<Projet> getProjets() {return projets;}
	  public void setProjets(List<Projet> projets) {this.projets = projets;}
	
	  public String getNomColl() {return nomColl;}
	  public void setNomColl(String nomColl) {this.nomColl = nomColl;}
		
	  public String getPrenomColl() {return prenomColl;}
	  public void setPrenomColl(String prenomColl) {this.prenomColl = prenomColl;}
		
	  public String getImage() {return image;}
	  public void setImage(String image) {this.image = image;}
	

}
