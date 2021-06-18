package com.bison.petsyApp.dtos.animal;

import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindAnimalDTO {

	private Long id_animal;
	 	
    private String nom_animal;
    private String race_animal;
    private String description_animal;
    
    private Long age_animal;
    private Boolean ismale_animal;
    
    private AnimalUtilisateurDTO utilisateur;
    
    private AnimalTypeDTO type;
    
    private Collection<AnimalPetsyDTO> petsys;
    
    private Collection<AnimalPhotoDTO> photos;
}
