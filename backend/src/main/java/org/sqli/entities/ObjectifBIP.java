package org.sqli.entities;

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
public class ObjectifBIP {
	
	private int idObjectifBIP;	
	private String nomObjectifBIP;
	private List<BIP> bipList=new LinkedList<BIP>();
	

	   @Id
	   @GeneratedValue(strategy = GenerationType.SEQUENCE)
	   public int getIdObjectifBIP() {return idObjectifBIP;}
	   public void setIdObjectifBIP(int idObjectifBAP) {this.idObjectifBIP = idObjectifBAP;}

	   @ManyToMany
	   @JoinTable(joinColumns={@JoinColumn(name="idObjectifBIP")},
	           inverseJoinColumns={@JoinColumn(name="idBIP")})
	   public List<BIP> getBipList() {return bipList;}
	   public void setBipList(List<BIP> bips) {this.bipList = bips;}
	   
	   public String getNomObjectifBAP() {return nomObjectifBIP;}
	   public void setNomObjectifBAP(String nomObjectif) {this.nomObjectifBIP = nomObjectif;}
}
