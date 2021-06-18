package com.bison.petsyApp.dtos.petsy;

import java.util.Collection;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindPetsyDTO {
	
	private Long id_petsy;
	
	private PetsyAnimalDTO animal;
	
	private int nblike_petsy;
	private Date datecrea_petsy;
	private Date datemodif_petsy;
	private String lien_petsy;
	private String texte_petsy;
	private String liendu_petsy;
	
	private Collection<PetsyPhotoDTO> photos;
	
	private Collection<PetsyCommentaireDTO> commentaires;
	
	private Collection<PetsyUtilisateurDTO> utilisateurs;
}
