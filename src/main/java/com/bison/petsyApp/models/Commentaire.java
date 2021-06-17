package com.bison.petsyApp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_commentaire;

    private String texte_commentaire;

    @CreationTimestamp
    private Date date_commentaire;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    @JsonIgnoreProperties("commentaires")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "id_petsy")
    @JsonIgnoreProperties("commentaires")
    private Petsy petsy;
}
