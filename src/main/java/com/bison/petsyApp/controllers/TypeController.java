package com.bison.petsyApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bison.petsyApp.dtos.type.DeleteTypeDTO;
import com.bison.petsyApp.dtos.type.FindTypeDTO;
import com.bison.petsyApp.dtos.type.PostTypeDTO;
import com.bison.petsyApp.dtos.type.PutTypeDTO;
import com.bison.petsyApp.services.TypeService;

public class TypeController {

	@Autowired
	TypeService service;

	@GetMapping
	public List<FindTypeDTO> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public FindTypeDTO findById(@PathVariable Long id) {
		return this.service.findById(id);
	}

	@PostMapping
	public FindTypeDTO save(@RequestBody PostTypeDTO postTypeDTO) {
		return this.service.save(postTypeDTO);
	}

	@PutMapping
	public FindTypeDTO update(@RequestBody PutTypeDTO putTypeDTO) {
		return this.service.update(putTypeDTO);
	}

	@DeleteMapping
	public void delete(@RequestBody DeleteTypeDTO deleteTypeDTO) {
		this.service.delete(deleteTypeDTO);
	}

}
