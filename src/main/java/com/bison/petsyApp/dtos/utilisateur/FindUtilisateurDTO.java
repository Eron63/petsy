package com.bison.petsyApp.dtos.utilisateur;

import com.bison.petsyApp.dtos.petsy.PetsyAnimalDTO;
import com.bison.petsyApp.models.Animal;
import com.bison.petsyApp.models.Petsy;
import com.bison.petsyApp.models.Utilisateur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindUtilisateurDTO {
    private String nom_utilisateur;
    private String prenom_utilisateur;
    private String email_utilisateur;
    private Collection<UtilisateurAnimalDTO> animaux;
    private Collection<UtilisateurFriendDTO> amis;

    private Collection<PetsyAnimalDTO> petsys;

}
