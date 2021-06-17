package com.bison.petsyApp.controllers;

import com.bison.petsyApp.dtos.utilisateur.DeleteUtilisateurDTO;
import com.bison.petsyApp.dtos.utilisateur.FindUtilisateurDTO;
import com.bison.petsyApp.dtos.utilisateur.PostUtilisateurDTO;
import com.bison.petsyApp.dtos.utilisateur.PutUtilisateurDTO;
import com.bison.petsyApp.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("utilisateurs")
@CrossOrigin
public class UtilisateurController {

    @Autowired
    UtilisateurService service;

    @GetMapping
    public List<FindUtilisateurDTO> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public FindUtilisateurDTO findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public FindUtilisateurDTO save(@RequestBody PostUtilisateurDTO postClientDTO) {
        return this.service.save(postClientDTO);
    }

    @PutMapping
    public FindUtilisateurDTO update(@RequestBody PutUtilisateurDTO putUtilisateurDTO) {
        return this.service.update(putUtilisateurDTO);
    }

    @DeleteMapping
    public void delete(@RequestBody DeleteUtilisateurDTO deleteClientDTO) {
        this.service.delete(deleteClientDTO);
    }

}
