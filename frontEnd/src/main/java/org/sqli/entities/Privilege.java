package org.sqli.entities;

import java.util.LinkedList;
import java.util.List;


public class Privilege {
	
	private int idPrivilege;
	private String nomPrivilege;
	private List<Salarie> salaries=new LinkedList<Salarie>();
	

	public int getIdPrivilege() {return idPrivilege;}
	public void setIdPrivilege(int iD) {idPrivilege = iD;}
	
	public String getNomPrivilege() {return nomPrivilege;}
	public void setNomPrivilege(String nomPrivilege) {this.nomPrivilege = nomPrivilege;}
	

	public List<Salarie> getSalaries() {return salaries;}
	public void setSalaries(List<Salarie> salaries) {this.salaries = salaries;}
	
	
	
	

}
