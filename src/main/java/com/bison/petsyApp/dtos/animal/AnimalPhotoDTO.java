package com.bison.petsyApp.dtos.animal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalPhotoDTO {

	private long id_photo;
	
	private String lien_photo;

}
