package com.bison.petsyApp.dtos.petsy;

import java.util.Collection;

import com.bison.petsyApp.models.Animal;
import com.bison.petsyApp.models.Photo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutPetsyDTO {
	private Long id;
	private Animal animal;
	private String lien_petsy;
	private String texte_petsy;
	private String liendu_petsy;
	private Collection<Photo> photos;
}
