package com.bison.petsyApp.controllers;

import java.util.List;
import java.util.Optional;

import com.bison.petsyApp.dtos.animal.FindAnimalDTO;
import com.bison.petsyApp.dtos.petsy.PutPetsyDTO;
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

import com.bison.petsyApp.dtos.petsy.DeletePetsyDTO;
import com.bison.petsyApp.dtos.petsy.FindPetsyDTO;
import com.bison.petsyApp.dtos.petsy.PostPetsyDTO;
import com.bison.petsyApp.services.PetsyService;

@RestController
@RequestMapping("petsys")
@CrossOrigin
public class PetsyController {

	@Autowired
	PetsyService service;
	
	@GetMapping
	public ResponseEntity<List<FindPetsyDTO>> findAll() {
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity findById(@PathVariable Long id) {
		Optional<FindPetsyDTO> findDTO = this.service.findById(id);

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
	public ResponseEntity save(@RequestBody PostPetsyDTO postPetsyDTO) {
        this.service.save(postPetsyDTO);
        return new ResponseEntity<>(postPetsyDTO, HttpStatus.CREATED);
    }
	
	@PutMapping
	public ResponseEntity update(@RequestBody PutPetsyDTO putPetsyDTO) {
        this.service.update(putPetsyDTO);
        return new ResponseEntity<>(putPetsyDTO, HttpStatus.CREATED);
    }
	
	@DeleteMapping
	public ResponseEntity delete(@RequestBody DeletePetsyDTO deletePetsyDTO) {
	    this.service.delete(deletePetsyDTO);
		return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
	}
	
}
