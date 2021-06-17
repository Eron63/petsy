package com.bison.petsyApp.dtos.petsy;

import java.time.LocalDateTime;
import java.util.Collection;

import com.bison.petsyApp.models.Animal;
import com.bison.petsyApp.models.Commentaire;
import com.bison.petsyApp.models.Photo;
import com.bison.petsyApp.models.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindPetsyDTO {
	private Long id_petsy;
	private Animal animal;
	private int nblike_petsy;
	private LocalDateTime datecrea_petsy;
	private LocalDateTime datemodif_petsy;
	private String lien_petsy;
	private String texte_petsy;
	private String liendu_petsy;
	private Collection<Photo> photos;
	private Collection<Commentaire> commentaires;
	private Collection<Utilisateur> utilisateurs;
}
