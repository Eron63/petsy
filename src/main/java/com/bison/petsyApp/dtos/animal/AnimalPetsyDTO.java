package com.bison.petsyApp.dtos.animal;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalPetsyDTO {
	
	private Long id_petsy;
	private Boolean is_animal;
	private int nblike_petsy;
	
	private Date datecrea_petsy;
	private Date datemodif_petsy;
	private String lien_petsy;
	private String texte_petsy;
	private String liendu_petsy;
	

}
