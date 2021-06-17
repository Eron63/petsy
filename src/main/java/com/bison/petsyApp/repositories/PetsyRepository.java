package com.bison.petsyApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bison.petsyApp.models.Petsy;

public interface PetsyRepository extends JpaRepository<Petsy, Long>{

}
