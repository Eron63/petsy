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


    @OneToMany(mappedBy = "utilisateur")
    @JsonIgnoreProperties("utilisateur")
    private Collection<Animal> animaux;
    
    @OneToMany(mappedBy = "utilisateur")
    @JsonIgnoreProperties("utilisateur")
    private Collection<Commentaire> commentaires;

    @ManyToMany
    @JoinTable(name = "utilisateur_has_friends",
            joinColumns = @JoinColumn(name = "id_utilisateur"),
            inverseJoinColumns = @JoinColumn(name= "id_ami"))
    @JsonIgnoreProperties("utilisateur")
    private Collection<Utilisateur> amis;
    
    @ManyToMany
    @JoinTable(name = "utilisateur_like_petsy",
            joinColumns = @JoinColumn(name = "id_utilisateur"),
            inverseJoinColumns = @JoinColumn(name= "id_petsy"))
    @JsonIgnoreProperties("utilisateur")
    private Collection<Petsy> petsys;


}
