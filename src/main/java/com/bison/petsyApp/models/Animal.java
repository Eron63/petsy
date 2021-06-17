package com.bison.petsyApp.models;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id_animal;
	 	
	    private String nom_animal;
	    private String race_animal;
	    private String description_animal;
	    
	    private Long age_animal;
	    private Boolean ismale_animal;
	    
	    @ManyToOne
	    @JoinColumn(name = "id_utilisateur")
	    @JsonIgnoreProperties("animaux")
	    private Utilisateur utilisateur;
	    
	    @ManyToOne
	    @JoinColumn(name = "id_type")
	    @JsonIgnoreProperties("animaux")
	    private Type type;
	    
	    @OneToMany(mappedBy = "animal")
	    @JsonIgnoreProperties("animal")
	    private Collection<Petsy> petsys;
	    
	    @OneToMany(mappedBy = "animal")
	    @JsonIgnoreProperties("animal")
	    private Collection<Photo> photos;
}
