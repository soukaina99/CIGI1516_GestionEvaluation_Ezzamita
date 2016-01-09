package org.sqli.entities;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ManagerRH {
	
	private int idManagerRH;
    private List<Collaborateur> colls=new LinkedList<Collaborateur>();
    
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getIdManagerRH() {return idManagerRH;}
	public void setIdManagerRH(int idManagerRH) {this.idManagerRH = idManagerRH;}
	
	@OneToMany(targetEntity=Collaborateur.class,mappedBy="manager")
	public List<Collaborateur> getColls() {return colls;}
	public void setColls(List<Collaborateur> colls) {this.colls = colls;}
	
	
}
