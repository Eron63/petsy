package com.bison.petsyApp.dtos.photo;

import com.bison.petsyApp.models.Animal;
import com.bison.petsyApp.models.Petsy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindPhotoDTO {
	private long id_photo;
	private String lien_photo;
	private PhotoAnimalDTO animal;
	private PhotoPetsyDTO petsy;
	
}