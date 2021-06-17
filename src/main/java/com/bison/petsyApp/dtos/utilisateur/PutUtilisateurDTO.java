package com.bison.petsyApp.dtos.utilisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutUtilisateurDTO {
    private int id_utilisateur;
    private String nom_utilisateur;
    private String prenom_utilisateur;
    private String email_utilisateur;
    private String password_utilisateur;
}
