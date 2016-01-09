package org.sqli.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

  @Entity
  @Table(name= "Employee") 
  public class Employee {
	  @Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	
  private int empID;
  private String nom;
  private String prenom;
  private String email;
  private String login;
  private String password;
  private String image;

  public String getNom() {return nom; }
  public void setNom(String nom) {this.nom = nom;}

  public String getPrenom() {return prenom;}
  public void setPrenom(String prenom) {this.prenom = prenom;}
  
  public String getEmail() {return email;}
  public void setEmail(String email) {this.email = email;}
  
  public String getLogin() {return login;}
  public void setLogin(String login) {this.login = login;}
  
  public String getPassword() {return password;}
  public void setPassword(String password) {this.password = password;}

  public String getImage() {return image;}
  public void setImage(String image) {this.image = image;}

  public int getEmpID() {return empID;}
  public void setEmpID(int empID) {this.empID = empID;}
  
}
