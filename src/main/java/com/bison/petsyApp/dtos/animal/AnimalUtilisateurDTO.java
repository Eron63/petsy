package com.bison.petsyApp.dtos.animal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalUtilisateurDTO {
	
	private String nom_utilisateur;
    private String prenom_utilisateur;
    private String email_utilisateur;

}
