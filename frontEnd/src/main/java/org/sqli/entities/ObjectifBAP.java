package org.sqli.entities;

import java.util.LinkedList;
import java.util.List;


public class ObjectifBAP {
	
private int idObjectifBAP;	
private String nomObjectifBAP;
private List<BAP> baps=new LinkedList<BAP>();


   public int getIdObjectifBAP() {return idObjectifBAP;}
   public void setIdObjectifBAP(int idObjectifBAP) {this.idObjectifBAP = idObjectifBAP;}


   public List<BAP> getBaps() {return baps;}
   public void setBaps(List<BAP> baps) {this.baps = baps;}
   
   public String getNomObjectifBAP() {return nomObjectifBAP;}
   public void setNomObjectifBAP(String nomObjectif) {this.nomObjectifBAP = nomObjectif;}



}
