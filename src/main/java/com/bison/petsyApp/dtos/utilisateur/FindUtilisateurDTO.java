package com.bison.petsyApp.dtos.utilisateur;

import com.bison.petsyApp.models.Animal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindUtilisateurDTO {
    private Long id_utilisateur;
    private String nom_utilisateur;
    private String prenom_utilisateur;
    private String email_utilisateur;
    private Collection<Animal> animaux;
}
