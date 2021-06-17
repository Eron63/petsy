package com.bison.petsyApp.dtos.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutTypeDTO {
	private long id_type;
	private String nom_type;
}
