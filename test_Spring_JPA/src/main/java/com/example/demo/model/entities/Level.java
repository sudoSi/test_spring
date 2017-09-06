package com.example.demo.model.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Level implements Serializable{
	@Id
	private String ID;
	private String designation;
	@OneToMany(mappedBy="level")
	private Collection<Etudiant> etudiants;

	public Level() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Level(String iD, String designation) {
		super();
		ID = iD;
		this.designation = designation;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
}
