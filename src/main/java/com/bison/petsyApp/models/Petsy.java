package com.bison.petsyApp.models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

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
	
	@CreatedDate
	private Date datecrea_petsy;
	@LastModifiedDate
	private Date datemodif_petsy;
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
            joinColumns = @JoinColumn(name = "id_petsy"),
            inverseJoinColumns = @JoinColumn(name= "id_utilisateur"))
	@JsonIgnoreProperties("utilisateur")
    private Collection<Utilisateur> utilisateurs;

}
