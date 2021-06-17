package com.bison.petsyApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bison.petsyApp.dtos.photo.DeletePhotoDTO;
import com.bison.petsyApp.dtos.photo.FindPhotoDTO;
import com.bison.petsyApp.dtos.photo.PostPhotoDTO;
import com.bison.petsyApp.dtos.photo.PutPhotoDTO;
import com.bison.petsyApp.services.PhotoService;

public class PhotoController {

	@Autowired
	PhotoService service;

	@GetMapping
	public List<FindPhotoDTO> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public FindPhotoDTO findById(@PathVariable Long id) {
		return this.service.findById(id);
	}

	@PostMapping
	public FindPhotoDTO save(@RequestBody PostPhotoDTO postPhotoDTO) {
		return this.service.save(postPhotoDTO);
	}

	@PutMapping
	public FindPhotoDTO update(@RequestBody PutPhotoDTO putPhotoDTO) {
		return this.service.update(putPhotoDTO);
	}

	@DeleteMapping
	public void delete(@RequestBody DeletePhotoDTO deletePhotoDTO) {
		this.service.delete(deletePhotoDTO);
	}

}
