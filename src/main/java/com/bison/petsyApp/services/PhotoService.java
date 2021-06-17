package com.bison.petsyApp.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.bison.petsyApp.dtos.photo.DeletePhotoDTO;
import com.bison.petsyApp.dtos.photo.FindPhotoDTO;
import com.bison.petsyApp.dtos.photo.PostPhotoDTO;
import com.bison.petsyApp.dtos.photo.PutPhotoDTO;
import com.bison.petsyApp.models.Photo;
import com.bison.petsyApp.repositories.PhotoRepository;

public class PhotoService {

	PhotoRepository repository;
	ModelMapper mapper;

	public PhotoService(PhotoRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	public List<FindPhotoDTO> findAll() {
		List<Photo> photos = this.repository.findAll();
		List<FindPhotoDTO> photoDTOS = new ArrayList<>();
		photos.forEach(photo -> photoDTOS.add(mapper.map(photo, FindPhotoDTO.class)));
		return photoDTOS;
	}

	public FindPhotoDTO save(PostPhotoDTO postPhotoDTO) {
		Photo photo = mapper.map(postPhotoDTO, Photo.class);
		return mapper.map(this.repository.save(photo), FindPhotoDTO.class);
	}

	public FindPhotoDTO update(PutPhotoDTO putPhotoDTO) {
		Photo photo = mapper.map(putPhotoDTO, Photo.class);
		return mapper.map(this.repository.save(photo), FindPhotoDTO.class);
	}

	public FindPhotoDTO findById(Long id) {
		return mapper.map(this.repository.findById(id).get(), FindPhotoDTO.class);
	}

	public void delete(DeletePhotoDTO deletePhotoDTO) {
		this.repository.delete(mapper.map(deletePhotoDTO, Photo.class));
	}

}
