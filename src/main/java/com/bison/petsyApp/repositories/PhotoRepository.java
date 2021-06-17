package com.bison.petsyApp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bison.petsyApp.models.Photo;


public interface PhotoRepository extends JpaRepository<Photo, Long> {

}
