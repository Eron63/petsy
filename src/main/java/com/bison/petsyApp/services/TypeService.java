package com.bison.petsyApp.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.bison.petsyApp.dtos.type.DeleteTypeDTO;
import com.bison.petsyApp.dtos.type.FindTypeDTO;
import com.bison.petsyApp.dtos.type.PostTypeDTO;
import com.bison.petsyApp.dtos.type.PutTypeDTO;
import com.bison.petsyApp.models.Type;
import com.bison.petsyApp.repositories.TypeRepository;

public class TypeService {

	TypeRepository repository;
	ModelMapper mapper;

	public TypeService(TypeRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	public List<FindTypeDTO> findAll() {
		List<Type> types = this.repository.findAll();
		List<FindTypeDTO> typesDTOS = new ArrayList<>();
		types.forEach(type -> typesDTOS.add(mapper.map(type, FindTypeDTO.class)));
		return typesDTOS;
	}

	public FindTypeDTO save(PostTypeDTO postTypeDTO) {
		Type type = mapper.map(postTypeDTO, Type.class);
		return mapper.map(this.repository.save(type), FindTypeDTO.class);
	}

	public FindTypeDTO update(PutTypeDTO putTypeDTO) {
		Type type = mapper.map(putTypeDTO, Type.class);
		return mapper.map(this.repository.save(type), FindTypeDTO.class);
	}

	public FindTypeDTO findById(Long id) {
		return mapper.map(this.repository.findById(id).get(), FindTypeDTO.class);
	}

	public void delete(DeleteTypeDTO deleteTypeDTO) {
		this.repository.delete(mapper.map(deleteTypeDTO, Type.class));
	}

}
