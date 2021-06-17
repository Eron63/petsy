package com.bison.petsyApp.repositories;

import com.bison.petsyApp.models.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {

}
