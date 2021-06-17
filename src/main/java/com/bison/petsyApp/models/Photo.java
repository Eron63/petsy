package com.bison.petsyApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Photo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_photo;
	private String lien_photo;

	@ManyToOne
	@JoinColumn(name = "id_animal")
	@JsonIgnoreProperties("photo")
	private Animal animal;

	@ManyToOne
	@JoinColumn(name = "id_petsy")
	@JsonIgnoreProperties("photo")
	private Petsy petsy;

}
