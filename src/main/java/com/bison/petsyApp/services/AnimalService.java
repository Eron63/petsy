package com.bison.petsyApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;

import com.bison.petsyApp.dtos.animal.DeleteAnimalDTO;
import com.bison.petsyApp.dtos.animal.FindAnimalDTO;
import com.bison.petsyApp.dtos.animal.PostAnimalDTO;
import com.bison.petsyApp.dtos.animal.PutAnimalDTO;
import com.bison.petsyApp.models.Animal;
import com.bison.petsyApp.repositories.AnimalRepository;

public class AnimalService {
	
	 AnimalRepository repository;
	 ModelMapper mapper;
	 
	 public AnimalService(AnimalRepository repository, ModelMapper mapper) {
		 this.repository = repository;
		 this.mapper = mapper;
	 }
	 
	 public List<FindAnimalDTO> findAll() {
	        List<Animal> Animal = this.repository.findAll();
	        List<FindAnimalDTO> AnimalDTOS = new ArrayList<>();
	        Animal.forEach(animal -> AnimalDTOS.add(mapper.map(animal, FindAnimalDTO.class)));
	        return AnimalDTOS;
	    }

	    public FindAnimalDTO save(PostAnimalDTO postAnimalDTO) {
	        Animal Animal = mapper.map(postAnimalDTO, Animal.class);
	        return mapper.map(this.repository.save(Animal), FindAnimalDTO.class);
	    }

	    public FindAnimalDTO update(PutAnimalDTO putAnimalDTO) {
	        Animal Animal = mapper.map(putAnimalDTO, Animal.class);
	        return mapper.map(this.repository.save(Animal), FindAnimalDTO.class);
	    }

	    public Optional<FindAnimalDTO> findById(Long id) {
	    	if(mapper.map(this.repository.findById(id).get(), FindAnimalDTO.class) != null)
	    	{
	    		return Optional.of(mapper.map(this.repository.findById(id).get(), FindAnimalDTO.class)) ;
	    	}
	    	else {

		        return Optional.empty();
	    	}
	    }

	    public void delete(DeleteAnimalDTO deleteAnimalDTO) {
	        this.repository.delete(mapper.map(deleteAnimalDTO, Animal.class));
	    }

}
