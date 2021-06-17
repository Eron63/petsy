package com.bison.petsyApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bison.petsyApp.models.Type;

public interface TypeRepository extends JpaRepository<Type, Long> {

}
