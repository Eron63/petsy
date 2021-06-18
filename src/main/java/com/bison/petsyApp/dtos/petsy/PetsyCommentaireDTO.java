package com.bison.petsyApp.dtos.petsy;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetsyCommentaireDTO {
	
	private Long id_commentaire;

    private String texte_commentaire;
    
    private Date date_commentaire;


}
