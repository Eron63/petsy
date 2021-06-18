package com.bison.petsyApp.dtos.commentaire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentaireUtilisateurDTO {

    private Long id_utilisateur;
    private String nom_utilisateur;
    private String prenom_utilisateur;
    private String email_utilisateur;

}
