package com.bison.petsyApp.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_type;
	private String nom_type;

	@OneToMany(mappedBy = "type")
	@JsonIgnoreProperties("type")
	private Collection<Animal> animaux;

}
