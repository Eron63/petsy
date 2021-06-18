package com.bison.petsyApp.dtos.photo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhotoAnimalDTO {

	private Long id_animal;
	private String nom_animal;
	private String race_animal;
	private String description_animal;
	private Long age_animal;
	private Boolean ismale_animal;

}