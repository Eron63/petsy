package com.bison.petsyApp.dtos.utilisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindUtilisateurNameDTO {
    private String nom_utilisateur;
    private String prenom_utilisateur;
}