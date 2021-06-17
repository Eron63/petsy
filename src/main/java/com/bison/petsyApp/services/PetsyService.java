package com.bison.petsyApp.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.bison.petsyApp.dtos.petsy.DeletePetsyDTO;
import com.bison.petsyApp.dtos.petsy.FindPetsyDTO;
import com.bison.petsyApp.dtos.petsy.PostPetsyDTO;
import com.bison.petsyApp.models.Petsy;
import com.bison.petsyApp.repositories.PetsyRepository;

public class PetsyService {
	
	PetsyRepository repository;
	ModelMapper mapper;
	
	public PetsyService(PetsyRepository repository, ModelMapper mapper) {
		this.repository = repository;
        this.mapper = mapper;
	}
	
	public List<FindPetsyDTO> findAll() {
        List<Petsy> petsys = this.repository.findAll();
        List<FindPetsyDTO> petsysDTOS = new ArrayList<>();
        petsys.forEach(petsy -> petsysDTOS.add(mapper.map(petsy, FindPetsyDTO.class)));
        return petsysDTOS;
    }
	
	public FindPetsyDTO save(PostPetsyDTO postPetsyDTO) {
		Petsy petsy = mapper.map(postPetsyDTO, Petsy.class);
		return mapper.map(this.repository.save(petsy), FindPetsyDTO.class);
	}

	public FindPetsyDTO update(PostPetsyDTO postPetsyDTO) {
		Petsy petsy = mapper.map(postPetsyDTO, Petsy.class);
		return mapper.map(this.repository.save(petsy), FindPetsyDTO.class);
	}
	
	public FindPetsyDTO findById(Long id) {
		return mapper.map(this.repository.findById(id).get(), FindPetsyDTO.class);
	}
	
	public void delete(DeletePetsyDTO deletePetsyDTO) {
		this.repository.delete(mapper.map(deletePetsyDTO, Petsy.class));
	}
	
}
