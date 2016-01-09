package org.sqli.entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;



public class BAP {

	
	private int idBAP;
	
    private Date dateBAP;
    private List<BIP> bips=new LinkedList<BIP>();
    
  
    private Collaborateur coll;
    
    private List<ObjectifBAP> objectives=new LinkedList<ObjectifBAP>();
    

	public int getIdBAP() {return idBAP;}
	public void setIdBAP(int idBAP) {this.idBAP = idBAP;}

	
	public Date getDateBAP() {return dateBAP;}
	public void setDateBAP(Date dateBAP) {this.dateBAP = dateBAP;}
	
	
	public List<BIP> getBips() {return bips;}
	public void setBips(List<BIP> bips) {this.bips = bips;}
	
	public Collaborateur getColl() {return coll;}
	public void setColl(Collaborateur coll) {this.coll = coll;}
	

	public List<ObjectifBAP> getObjectives() {return objectives;}
	public void setObjectives(List<ObjectifBAP> objectives) {this.objectives = objectives;}
    
    
}
