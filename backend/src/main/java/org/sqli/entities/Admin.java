package org.sqli.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	 private int idAdmin;
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getIdAdmin() {return idAdmin;}
	public void setIdAdmin(int idAdmin) {this.idAdmin = idAdmin;}
	 
	 

}
