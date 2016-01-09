package org.sqli.entities;

import java.util.LinkedList;
import java.util.List;

public class ObjectifBIP {
	
	private int idObjectifBIP;	
	private String nomObjectifBIP;
	private List<BIP> bipList=new LinkedList<BIP>();
	

	   public int getIdObjectifBIP() {return idObjectifBIP;}
	   public void setIdObjectifBIP(int idObjectifBAP) {this.idObjectifBIP = idObjectifBAP;}


	   public List<BIP> getBipList() {return bipList;}
	   public void setBipList(List<BIP> bips) {this.bipList = bips;}
	   
	   public String getNomObjectifBAP() {return nomObjectifBIP;}
	   public void setNomObjectifBAP(String nomObjectif) {this.nomObjectifBIP = nomObjectif;}
}
