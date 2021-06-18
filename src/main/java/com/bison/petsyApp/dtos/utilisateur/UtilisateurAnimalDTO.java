package com.bison.petsyApp.dtos.utilisateur;

import com.bison.petsyApp.dtos.animal.AnimalPetsyDTO;
import com.bison.petsyApp.dtos.animal.AnimalPhotoDTO;
import com.bison.petsyApp.dtos.animal.AnimalTypeDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurAnimalDTO {

    private String nom_animal;
    private String race_animal;
    private String description_animal;

    private Long age_animal;
    private Boolean ismale_animal;

    private AnimalTypeDTO type;

    private Collection<AnimalPetsyDTO> petsys;

    private Collection<AnimalPhotoDTO> photos;
}
