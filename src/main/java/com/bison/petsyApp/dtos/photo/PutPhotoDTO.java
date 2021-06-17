package com.bison.petsyApp.dtos.photo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutPhotoDTO {
	private long id_photo;
	private String lien_photo;
}
