package com.bison.petsyApp.controllers;

import com.bison.petsyApp.dtos.commentaire.DeleteCommentaireDTO;
import com.bison.petsyApp.dtos.commentaire.FindCommentaireDTO;
import com.bison.petsyApp.dtos.commentaire.PostCommentaireDTO;
import com.bison.petsyApp.dtos.commentaire.PutCommentaireDTO;
import com.bison.petsyApp.services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("commentaires")
public class CommentaireController {


    @Autowired
    private CommentaireService service;

    @GetMapping
    public List<FindCommentaireDTO> findAll() {
        return this.service.findAll();
    }

    @PostMapping
    public FindCommentaireDTO save(@RequestBody PostCommentaireDTO postCommentaireDTO) {
        return this.service.save(postCommentaireDTO);
    }

    @PutMapping
    public FindCommentaireDTO update(@RequestBody PutCommentaireDTO putCommentaireDTO) {
        return this.service.update(putCommentaireDTO);
    }

    @DeleteMapping
    public void delete(@RequestBody DeleteCommentaireDTO deleteCommentaireDTO) {
        this.service.delete(deleteCommentaireDTO);
    }

}
