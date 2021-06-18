package com.bison.petsyApp.controllers;

import java.util.List;
import java.util.Optional;

import com.bison.petsyApp.dtos.petsy.DeletePetsyDTO;
import com.bison.petsyApp.dtos.petsy.FindPetsyDTO;
import com.bison.petsyApp.dtos.petsy.PostPetsyDTO;
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

import com.bison.petsyApp.dtos.photo.DeletePhotoDTO;
import com.bison.petsyApp.dtos.photo.FindPhotoDTO;
import com.bison.petsyApp.dtos.photo.PostPhotoDTO;
import com.bison.petsyApp.dtos.photo.PutPhotoDTO;
import com.bison.petsyApp.services.PhotoService;

@RestController
@RequestMapping("photos")
@CrossOrigin
public class PhotoController {

	@Autowired
	PhotoService service;

	@GetMapping
	public ResponseEntity<List<FindPhotoDTO>> findAll() {
		return ResponseEntity.ok(this.service.findAll());
	}

	@GetMapping("{id}")
	public ResponseEntity findById(@PathVariable Long id) {
		Optional<FindPhotoDTO> findDTO = this.service.findById(id);

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
	public ResponseEntity save(@RequestBody PostPhotoDTO postPhotoDTO) {
		this.service.save(postPhotoDTO);
		return new ResponseEntity<>(postPhotoDTO, HttpStatus.CREATED);
	}


	@PutMapping
	public ResponseEntity update(@RequestBody PutPhotoDTO putPhotoDTO) {
		this.service.update(putPhotoDTO);
		return new ResponseEntity<>(putPhotoDTO, HttpStatus.CREATED);
	}

	@DeleteMapping
	public ResponseEntity delete(@RequestBody DeletePhotoDTO deletePhotoDTO) {
		this.service.delete(deletePhotoDTO);
		return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
	}

}
