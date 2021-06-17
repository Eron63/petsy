package com.bison.petsyApp.models;

import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Petsy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_petsy;
	
	@ManyToOne
    @JoinColumn(name = "id_animal")
	@JsonIgnoreProperties("petsys")
	private Animal animal;
	
	private Boolean is_animal;
	private int nblike_petsy;
	private LocalDateTime datecrea_petsy;
	private LocalDateTime datemodif_petsy;
	private String lien_petsy;
	private String texte_petsy;
	private String liendu_petsy;
	
	@OneToMany(mappedBy = "petsy")
	@JsonIgnoreProperties("petsy")
	private Collection<Photo> photos;
	
	@OneToMany(mappedBy = "petsy")
	@JsonIgnoreProperties("petsy")
	private Collection<Commentaire> commentaires;
	
	@ManyToMany
    @JoinTable(name = "commande_like_petsy",
            joinColumns = @JoinColumn(name = "petsyid"),
            inverseJoinColumns = @JoinColumn(name= "utilisateur_id"))
    private Collection<Utilisateur> utilisateurs;

}
