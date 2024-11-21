package com.projet.RH.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="ville")
public class Ville {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identifiant unique pour la ville

    @Column(nullable = false)
    private String ville; // Nom de la ville

    @Column(nullable = false, length = 10)
    private String codePostal; // Code postal associé à la ville

    // Relation avec les utilisateurs (si applicable dans votre MCD)
    @OneToMany(mappedBy = "ville", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Utilisateur> utilisateurs; // Liste des utilisateurs habitant dans cette ville

    // Constructeurs
    public Ville() {}

    public Ville(String ville, String codePostal) {
        this.ville = ville;
        this.codePostal = codePostal;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Set<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}

