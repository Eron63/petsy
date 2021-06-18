package com.bison.petsyApp.dtos.utilisateur;

import com.bison.petsyApp.dtos.petsy.PetsyAnimalDTO;
import com.bison.petsyApp.dtos.petsy.PetsyCommentaireDTO;
import com.bison.petsyApp.dtos.petsy.PetsyPhotoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurPetsyDTO {
    private PetsyAnimalDTO animal;

    private int nblike_petsy;
    private Date datecrea_petsy;
    private Date datemodif_petsy;
    private String lien_petsy;
    private String texte_petsy;
    private String liendu_petsy;

    private Collection<PetsyPhotoDTO> photos;

    private Collection<PetsyCommentaireDTO> commentaires;

}
