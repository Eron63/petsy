package com.bison.petsyApp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_utilisateur;
    private String nom_utilisateur;
    private String prenom_utilisateur;
    private String email_utilisateur;
    private String password_utilisateur;


    @OneToMany(mappedBy = "animal")
    @JsonIgnoreProperties("animal")
    private Collection<Animal> animaux;

    @ManyToMany
    @JoinTable(name = "utilisateur_has_friends",
            joinColumns = @JoinColumn(name = "id_utilisateur"),
            inverseJoinColumns = @JoinColumn(name= "id_utilisateur1"))
    private Collection<Utilisateur> amis;


}
