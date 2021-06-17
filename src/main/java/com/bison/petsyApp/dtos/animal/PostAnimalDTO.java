package com.bison.petsyApp.dtos.animal;

import com.bison.petsyApp.models.Type;
import com.bison.petsyApp.models.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostAnimalDTO {
 	
    private String nom_animal;
    private String race_animal;
    private String description_animal;
    
    private Long age_animal;
    private Boolean ismale_animal;
    
    private Utilisateur utilisateur;
    
    private Type type;
}
