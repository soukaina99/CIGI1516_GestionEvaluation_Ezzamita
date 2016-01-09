package org.sqli.entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


public class BIP {
	
	private int idBIP;
	private int idBAP;
	private Date dateBIP;
	
	
	private BAP bap;
	
	private List<ObjectifBIP> objectives=new LinkedList<ObjectifBIP>();
	 
	public int getIdBIP() {return idBIP;}
	public void setIdBIP(int idBIP) {this.idBIP = idBIP;}
	
	public int getIdBAP() {return idBAP;}
	public void setIdBAP(int idBAP) {this.idBAP = idBAP;}
	
	public Date getDateBIP() {return dateBIP;}
	public void setDateBIP(Date dateBIP) {this.dateBIP = dateBIP;}
	
	
	public BAP getBap() {return bap;}
	public void setBap(BAP bap) {this.bap = bap;}
	
	
	public List<ObjectifBIP> getObjectives() {return objectives;}
	public void setObjectives(List<ObjectifBIP> objectives) {this.objectives = objectives;}
    	
}
