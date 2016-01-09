package org.sqli.entities;

import java.util.LinkedList;
import java.util.List;


public class Salarie {
   
    private int idSalarie;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String password;
	private String image;
    private List<Privilege> privs=new LinkedList<Privilege>();
    
    
	public int getIdSalarie() {return idSalarie;}
	public void setIdSalarie(int idSalarie) {this.idSalarie = idSalarie;}
	
   
	public List<Privilege> getPrivs() {return privs;}
	public void setPrivs(List<Privilege> privs) {this.privs = privs;}
	
	public String getNom() {return nom;}
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
	
    
	
	

}
