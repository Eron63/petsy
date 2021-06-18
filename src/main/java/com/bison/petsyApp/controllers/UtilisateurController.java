package com.bison.petsyApp.controllers;

import com.bison.petsyApp.dtos.petsy.DeletePetsyDTO;
import com.bison.petsyApp.dtos.petsy.FindPetsyDTO;
import com.bison.petsyApp.dtos.petsy.PostPetsyDTO;
import com.bison.petsyApp.dtos.petsy.PutPetsyDTO;
import com.bison.petsyApp.dtos.utilisateur.DeleteUtilisateurDTO;
import com.bison.petsyApp.dtos.utilisateur.FindUtilisateurDTO;
import com.bison.petsyApp.dtos.utilisateur.PostUtilisateurDTO;
import com.bison.petsyApp.dtos.utilisateur.PutUtilisateurDTO;
import com.bison.petsyApp.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("utilisateurs")
@CrossOrigin
public class UtilisateurController {

    @Autowired
    UtilisateurService service;

    @GetMapping
    public ResponseEntity<List<FindUtilisateurDTO>> findAll() {
        return ResponseEntity.ok(this.service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Optional<FindUtilisateurDTO> findDTO = this.service.findById(id);

        if(findDTO.isPresent())
        {
            return new ResponseEntity<>(findDTO.get(), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity save(@RequestBody PostUtilisateurDTO postUtilisateurDTO) {
        this.service.save(postUtilisateurDTO);
        return new ResponseEntity<>(postUtilisateurDTO, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody PutUtilisateurDTO putUtilisateurDTO) {
        this.service.update(putUtilisateurDTO);
        return new ResponseEntity<>(putUtilisateurDTO, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody DeleteUtilisateurDTO deleteUtilisateurDTO) {
        this.service.delete(deleteUtilisateurDTO);
        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
    }

}
