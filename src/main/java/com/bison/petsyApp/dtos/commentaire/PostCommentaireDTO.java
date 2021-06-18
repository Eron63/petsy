package com.bison.petsyApp.dtos.commentaire;

import com.bison.petsyApp.models.Petsy;
import com.bison.petsyApp.models.Utilisateur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostCommentaireDTO {

    private Long id_commentaire;

    private String texte_commentaire;

    private Date date_commentaire;

    private Utilisateur utilisateur;

    private Petsy petsy;


}
