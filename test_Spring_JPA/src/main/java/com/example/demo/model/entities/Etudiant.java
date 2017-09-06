package com.example.demo.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Etudiant implements Serializable{
	@Id @GeneratedValue
	private Long Id;
	// new line bien an other new comment
	private String nom;
	private int nbr_pers;
	@ManyToOne
	@JoinColumn(name="CODE_LVL")
	private Level level;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nom, int nbr_pers) {
		super();
		this.nom = nom;
		this.nbr_pers = nbr_pers;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbr_pers() {
		return nbr_pers;
	}

	public void setNbr_pers(int nbr_pers) {
		this.nbr_pers = nbr_pers;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	
}