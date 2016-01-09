package org.sqli.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Theme {
	 @Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idTheme;
	private String nomTheme;
	
	public int getIdTheme() {return idTheme;}
	public void setIdTheme(int idTheme) {this.idTheme = idTheme;}
	
	public String getNomTheme() {return nomTheme;}
	public void setNomTheme(String nomTheme) {this.nomTheme = nomTheme;}
	
	

}
