package com.bison.petsyApp.controllers;

import java.util.List;
import java.util.Optional;

import com.bison.petsyApp.dtos.animal.DeleteAnimalDTO;
import com.bison.petsyApp.dtos.animal.FindAnimalDTO;
import com.bison.petsyApp.dtos.animal.PostAnimalDTO;
import com.bison.petsyApp.dtos.animal.PutAnimalDTO;
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

import com.bison.petsyApp.dtos.type.DeleteTypeDTO;
import com.bison.petsyApp.dtos.type.FindTypeDTO;
import com.bison.petsyApp.dtos.type.PostTypeDTO;
import com.bison.petsyApp.dtos.type.PutTypeDTO;
import com.bison.petsyApp.services.TypeService;

@RestController
@RequestMapping("types")
@CrossOrigin
public class TypeController {

	@Autowired
	TypeService service;

	@GetMapping
	public ResponseEntity<List<FindTypeDTO>> findAll() {
		return ResponseEntity.ok(this.service.findAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		Optional<FindTypeDTO> findDTO = this.service.findById(id);

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
	public ResponseEntity<PostTypeDTO> save(@RequestBody PostTypeDTO postTypeDTO) {

		this.service.save(postTypeDTO);
		return new ResponseEntity<>(postTypeDTO, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity update(@RequestBody PutTypeDTO putTypelDTO) {
		this.service.update(putTypelDTO);
		return new ResponseEntity<>(putTypelDTO, HttpStatus.CREATED);
	}

	@DeleteMapping
	public ResponseEntity delete(@RequestBody DeleteTypeDTO deleteTypeDTO) {
		this.service.delete(deleteTypeDTO);
		return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
	}

}
