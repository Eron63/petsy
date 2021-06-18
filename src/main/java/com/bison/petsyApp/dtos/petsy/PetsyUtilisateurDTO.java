package com.bison.petsyApp.dtos.petsy;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetsyUtilisateurDTO {
	private String nom_utilisateur;
    private String prenom_utilisateur;
    private String email_utilisateur;
}
