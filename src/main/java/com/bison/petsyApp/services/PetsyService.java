package com.bison.petsyApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bison.petsyApp.dtos.petsy.PutPetsyDTO;
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

	public Optional<FindPetsyDTO> findById(Long id) {
	    	if(mapper.map(this.repository.findById(id).get(), FindPetsyDTO.class) != null)
	    	{
	    		return Optional.of(mapper.map(this.repository.findById(id).get(), FindPetsyDTO.class)) ;
	    	}
	    	else {

		        return Optional.empty();
	    	}
	}
	
	public FindPetsyDTO save(PostPetsyDTO postPetsyDTO) {
		Petsy petsy = mapper.map(postPetsyDTO, Petsy.class);
		return mapper.map(this.repository.save(petsy), FindPetsyDTO.class);
	}

	public FindPetsyDTO update(PutPetsyDTO putPetsyDTO) {
		Petsy petsy = mapper.map(putPetsyDTO, Petsy.class);
		return mapper.map(this.repository.save(petsy), FindPetsyDTO.class);
	}
	
	public void delete(DeletePetsyDTO deletePetsyDTO) {
		this.repository.delete(mapper.map(deletePetsyDTO, Petsy.class));
	}
	
}
