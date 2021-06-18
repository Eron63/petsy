package com.bison.petsyApp.dtos.animal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalTypeDTO {
	
	private long id_type;
	private String nom_type;

}
