package org.sqli.entities;

import java.util.LinkedList;
import java.util.List;


public class ManagerRH {
	
	private int idManagerRH;
    private List<Collaborateur> colls=new LinkedList<Collaborateur>();

	public int getIdManagerRH() {return idManagerRH;}
	public void setIdManagerRH(int idManagerRH) {this.idManagerRH = idManagerRH;}
	

	public List<Collaborateur> getColls() {return colls;}
	public void setColls(List<Collaborateur> colls) {this.colls = colls;}
	
	
}
