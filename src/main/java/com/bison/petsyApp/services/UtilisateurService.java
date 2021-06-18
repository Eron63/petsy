package com.bison.petsyApp.services;

import com.bison.petsyApp.dtos.petsy.FindPetsyDTO;
import com.bison.petsyApp.dtos.utilisateur.DeleteUtilisateurDTO;
import com.bison.petsyApp.dtos.utilisateur.FindUtilisateurDTO;
import com.bison.petsyApp.dtos.utilisateur.PostUtilisateurDTO;
import com.bison.petsyApp.dtos.utilisateur.PutUtilisateurDTO;
import com.bison.petsyApp.models.Utilisateur;
import com.bison.petsyApp.repositories.UtilisateurRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UtilisateurService {

    UtilisateurRepository repository;
    ModelMapper mapper;

    public UtilisateurService(UtilisateurRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<FindUtilisateurDTO> findAll() {
        List<Utilisateur> utilisateurs = this.repository.findAll();
        List<FindUtilisateurDTO> utilisateursDTOS = new ArrayList<>();
        utilisateurs.forEach(utilisateur -> utilisateursDTOS.add(mapper.map(utilisateur, FindUtilisateurDTO.class)));
        return utilisateursDTOS;
    }

    public Optional<FindUtilisateurDTO> findById(Long id) {
        if(mapper.map(this.repository.findById(id).get(), FindUtilisateurDTO.class) != null)
        {
            return Optional.of(mapper.map(this.repository.findById(id).get(), FindUtilisateurDTO.class)) ;
        }
        else {

            return Optional.empty();
        }
    }

    public FindUtilisateurDTO save(PostUtilisateurDTO postUtilisateurDTO) {
        Utilisateur utilisateur = mapper.map(postUtilisateurDTO, Utilisateur.class);
        return mapper.map(this.repository.save(utilisateur), FindUtilisateurDTO.class);
    }

    public FindUtilisateurDTO update(PutUtilisateurDTO putUtilisateurDTO) {
        Utilisateur utilisateur = mapper.map(putUtilisateurDTO, Utilisateur.class);
        return mapper.map(this.repository.save(utilisateur), FindUtilisateurDTO.class);
    }


    public void delete(DeleteUtilisateurDTO deleteClientDTO) {
        this.repository.delete(mapper.map(deleteClientDTO, Utilisateur.class));
    }

}
