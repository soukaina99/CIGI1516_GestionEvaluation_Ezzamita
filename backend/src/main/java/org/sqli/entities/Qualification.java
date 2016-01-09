package org.sqli.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Qualification {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idQualification;
	private String nomQualification;		

	public int getIdQualification() {return idQualification;}
	public void setIdQualification(int idQualification) {this.idQualification = idQualification;}
	
	public String getNomQualification() {return nomQualification;}
	public void setNomQualification(String nomQualification) {this.nomQualification = nomQualification;}
	

	
}
