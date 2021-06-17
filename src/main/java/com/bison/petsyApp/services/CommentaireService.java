package com.bison.petsyApp.services;

import com.bison.petsyApp.dtos.commentaire.DeleteCommentaireDTO;
import com.bison.petsyApp.dtos.commentaire.FindCommentaireDTO;
import com.bison.petsyApp.dtos.commentaire.PostCommentaireDTO;
import com.bison.petsyApp.dtos.commentaire.PutCommentaireDTO;
import com.bison.petsyApp.models.Commentaire;
import com.bison.petsyApp.repositories.CommentaireRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class CommentaireService {


    CommentaireRepository repository;
    ModelMapper mapper;

    public CommentaireService(CommentaireRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<FindCommentaireDTO> findAll(){
        List<Commentaire> commentaires = this.repository.findAll();
        List<FindCommentaireDTO> commentaireDTOS = new ArrayList<>();
        commentaires.forEach(commentaire -> commentaireDTOS.add(mapper.map(commentaire, FindCommentaireDTO.class)));
        return commentaireDTOS;
    }

    public FindCommentaireDTO save(PostCommentaireDTO postCommentairesDTO){
        Commentaire commentaire = mapper.map(postCommentairesDTO, Commentaire.class);
        return mapper.map(this.repository.save(commentaire), FindCommentaireDTO.class);
    }

    public FindCommentaireDTO update(PutCommentaireDTO putCommentaireDTO){
        Commentaire commentaire = mapper.map(putCommentaireDTO, Commentaire.class);
        return mapper.map(this.repository.save(commentaire), FindCommentaireDTO.class);
    }

    public void delete(DeleteCommentaireDTO deleteCommentaireDTO){
        this.repository.delete(mapper.map(deleteCommentaireDTO, Commentaire.class));
    }
}
