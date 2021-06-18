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
	public List<FindPetsyDTO> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public FindPetsyDTO findById(@PathVariable Long id) {
        return this.service.findById(id);
    }
	
	@PostMapping
	public FindPetsyDTO save(@RequestBody PostPetsyDTO postPetsyDTO) {
        return this.service.save(postPetsyDTO);
    }
	
	@PutMapping
	public FindPetsyDTO update(@RequestBody PostPetsyDTO postPetsyDTO) {
        return this.service.save(postPetsyDTO);
    }
	
	@DeleteMapping
	public void delete(@RequestBody DeletePetsyDTO deletePetsyDTO) {
	    this.service.delete(deletePetsyDTO);
	}
	
}
