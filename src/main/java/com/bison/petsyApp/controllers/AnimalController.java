package com.bison.petsyApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	    public ResponseEntity<List<FindAnimalDTO>> findAll() {
	        return ResponseEntity.ok(this.service.findAll());
	    }
	    
	    @GetMapping("{id}")
	    public ResponseEntity<?> findById(@PathVariable Long id) {
	    	Optional<FindAnimalDTO> findDTO = this.service.findById(id);
	    	
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
	    public ResponseEntity<PostAnimalDTO> save(@RequestBody PostAnimalDTO postAnimalDTO) {
	    	
	        this.service.save(postAnimalDTO);
	        return new ResponseEntity<>(postAnimalDTO, HttpStatus.CREATED);
	    }

	    @PutMapping
	    public ResponseEntity update(@RequestBody PutAnimalDTO putAnimalDTO) {
	        this.service.update(putAnimalDTO);
	        return new ResponseEntity<>(putAnimalDTO, HttpStatus.CREATED);
	    }

	    @DeleteMapping
	    public ResponseEntity delete(@RequestBody DeleteAnimalDTO deleteAnimalDTO) {
	        this.service.delete(deleteAnimalDTO);
	        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
	    }

}
