package com.bison.petsyApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bison.petsyApp.models.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
