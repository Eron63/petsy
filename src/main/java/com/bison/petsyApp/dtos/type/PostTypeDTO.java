package com.bison.petsyApp.dtos.type;

import java.util.Collection;

import com.bison.petsyApp.models.Animal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostTypeDTO {
	private String nom_type;
	private Collection<Animal> animaux;
}
