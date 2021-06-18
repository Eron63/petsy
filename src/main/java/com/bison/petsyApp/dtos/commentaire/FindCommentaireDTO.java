package com.bison.petsyApp.dtos.commentaire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindCommentaireDTO {

    private Long id_commentaire;

    private String texte_commentaire;

    private Date date_commentaire;

    private CommentaireUtilisateurDTO utilisateur;

    private CommentairePetsyDTO petsy;

}
