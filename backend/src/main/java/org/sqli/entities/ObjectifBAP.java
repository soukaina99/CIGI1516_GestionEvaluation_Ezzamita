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
public class ObjectifBAP {
	
private int idObjectifBAP;	
private String nomObjectifBAP;
private List<BAP> baps=new LinkedList<BAP>();


   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   public int getIdObjectifBAP() {return idObjectifBAP;}
   public void setIdObjectifBAP(int idObjectifBAP) {this.idObjectifBAP = idObjectifBAP;}

   @ManyToMany
   @JoinTable(joinColumns={@JoinColumn(name="idObjectifBAP")},
           inverseJoinColumns={@JoinColumn(name="idBAP")})
   public List<BAP> getBaps() {return baps;}
   public void setBaps(List<BAP> baps) {this.baps = baps;}
   
   public String getNomObjectifBAP() {return nomObjectifBAP;}
   public void setNomObjectifBAP(String nomObjectif) {this.nomObjectifBAP = nomObjectif;}



}
