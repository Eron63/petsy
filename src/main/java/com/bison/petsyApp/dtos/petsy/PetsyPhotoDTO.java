package com.bison.petsyApp.dtos.petsy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetsyPhotoDTO {
	
	private long id_photo;
	
	private String lien_photo;
}
