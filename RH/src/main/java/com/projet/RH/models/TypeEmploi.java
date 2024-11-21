package com.projet.RH.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "type_emploi")
public class TypeEmploi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@NotBlank(message = "Le type d'emploi ne doit pas être null")
	private String type;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "duree_id", referencedColumnName = "id")
	private Duree duree;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Duree getDuree() {
		return duree;
	}
	public void setDuree(Duree duree) {
		this.duree = duree;
	}
	
	
	

}
