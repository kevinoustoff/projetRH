package com.projet.RH.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="offresemplois")
public class OffreEmploi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private Date datePublication;
	
	private String statut;
	
	private String description;
	
	private String reference;

	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public Date getDatePublication() {
		return datePublication;
	}

	public String getStatut() {
		return statut;
	}

	public String getDescription() {
		return description;
	}

	public String getReference() {
		return reference;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
}
