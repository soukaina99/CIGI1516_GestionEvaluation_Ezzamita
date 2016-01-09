package org.sqli.entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class BAP {

	
	private int idBAP;
	
    private Date dateBAP;
    private List<BIP> bips=new LinkedList<BIP>();
    
  
    private Collaborateur coll;
    
    private List<ObjectifBAP> objectives=new LinkedList<ObjectifBAP>();
    
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getIdBAP() {return idBAP;}
	public void setIdBAP(int idBAP) {this.idBAP = idBAP;}

	
	public Date getDateBAP() {return dateBAP;}
	public void setDateBAP(Date dateBAP) {this.dateBAP = dateBAP;}
	
	@OneToMany(targetEntity=BIP.class,mappedBy="bap" ,cascade=CascadeType.REMOVE)
	public List<BIP> getBips() {return bips;}
	public void setBips(List<BIP> bips) {this.bips = bips;}
	
	@ManyToOne
	@JoinColumn(name="idColl")
	public Collaborateur getColl() {return coll;}
	public void setColl(Collaborateur coll) {this.coll = coll;}
	
	@ManyToMany
	@JoinTable(joinColumns={@JoinColumn(name="idBAP")},
	           inverseJoinColumns={@JoinColumn(name="idObjectifBAP")})
	public List<ObjectifBAP> getObjectives() {return objectives;}
	public void setObjectives(List<ObjectifBAP> objectives) {this.objectives = objectives;}
    
    
}
