package com.bison.petsyApp.services;

import java.util.ArrayList;
import java.util.List;

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

	    public FindAnimalDTO findById(Long id) {
	        return mapper.map(this.repository.findById(id).get(), FindAnimalDTO.class);
	    }

	    public void delete(DeleteAnimalDTO deleteAnimalDTO) {
	        this.repository.delete(mapper.map(deleteAnimalDTO, Animal.class));
	    }

}
