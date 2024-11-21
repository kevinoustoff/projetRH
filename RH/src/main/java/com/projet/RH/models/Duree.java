package com.projet.RH.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="duree")
public class Duree {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Min(value = 2)
	@NotBlank(message = "Le mois doit être un nombre")
	private Long mois;
	
	@OneToOne(mappedBy = "duree")
	private TypeEmploi typeEmploi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMois() {
		return mois;
	}

	public void setMois(Long mois) {
		this.mois = mois;
	}
	public TypeEmploi getTypeEmploi() {
		return typeEmploi;
	}
	public void setTypeEmploi(TypeEmploi typeEmploi) {
		this.typeEmploi = typeEmploi;
	}
	
	

}
