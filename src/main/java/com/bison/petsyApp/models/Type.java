package com.bison.petsyApp.models;

import java.util.Collection;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Type {

	private int id_type;
	private String nom_type;

	@OneToMany(mappedBy = "animal")
	@JsonIgnoreProperties("animal")
	private Collection<Animal> animaux;

}
