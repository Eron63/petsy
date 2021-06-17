package com.bison.petsyApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bison.petsyApp.dtos.animal.DeleteAnimalDTO;
import com.bison.petsyApp.dtos.animal.FindAnimalDTO;
import com.bison.petsyApp.dtos.animal.PostAnimalDTO;
import com.bison.petsyApp.dtos.animal.PutAnimalDTO;
import com.bison.petsyApp.services.AnimalService;


@RestController
@RequestMapping("animaux")
@CrossOrigin
public class AnimalController {
	
	    @Autowired
	    AnimalService service;

	    @GetMapping
	    public List<FindAnimalDTO> findAll() {
	        return this.service.findAll();
	    }
	    
	    @GetMapping("{id}")
	    public FindAnimalDTO findById(@PathVariable Long id) {
	        return this.service.findById(id);
	    }

	    @PostMapping
	    public FindAnimalDTO save(@RequestBody PostAnimalDTO postAnimalDTO) {
	        return this.service.save(postAnimalDTO);
	    }

	    @PutMapping
	    public FindAnimalDTO update(@RequestBody PutAnimalDTO putAnimalDTO) {
	        return this.service.update(putAnimalDTO);
	    }

	    @DeleteMapping
	    public void delete(@RequestBody DeleteAnimalDTO deleteAnimalDTO) {
	        this.service.delete(deleteAnimalDTO);
	    }

}
