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
public class Privilege {
	
	private int idPrivilege;
	private String nomPrivilege;
	private List<Salarie> salaries=new LinkedList<Salarie>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getIdPrivilege() {return idPrivilege;}
	public void setIdPrivilege(int iD) {idPrivilege = iD;}
	
	public String getNomPrivilege() {return nomPrivilege;}
	public void setNomPrivilege(String nomPrivilege) {this.nomPrivilege = nomPrivilege;}
	
	@ManyToMany
	@JoinTable(name = "Salarie_Privilege", 
	           joinColumns = { @JoinColumn(name = "idPrivilege") },
	           inverseJoinColumns = {@JoinColumn(name = "idSalarie") })
	public List<Salarie> getSalaries() {return salaries;}
	public void setSalaries(List<Salarie> salaries) {this.salaries = salaries;}
	
	
	
	

}
