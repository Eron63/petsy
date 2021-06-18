package com.bison.petsyApp.controllers;

import com.bison.petsyApp.dtos.commentaire.DeleteCommentaireDTO;
import com.bison.petsyApp.dtos.commentaire.FindCommentaireDTO;
import com.bison.petsyApp.dtos.commentaire.PostCommentaireDTO;
import com.bison.petsyApp.dtos.commentaire.PutCommentaireDTO;
import com.bison.petsyApp.services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("commentaires")
public class CommentaireController {


    @Autowired
    private CommentaireService service;

    @GetMapping
    public ResponseEntity<List<FindCommentaireDTO>> findAll() {
        return ResponseEntity.ok(this.service.findAll());
    }

    @PostMapping
    public ResponseEntity save(@RequestBody PostCommentaireDTO postCommentaireDTO) {
        this.service.save(postCommentaireDTO);
        return new ResponseEntity<>(postCommentaireDTO, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody PutCommentaireDTO putCommentaireDTO) {
        this.service.update(putCommentaireDTO);
        return new ResponseEntity<>(putCommentaireDTO, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody DeleteCommentaireDTO deleteCommentaireDTO) {
        this.service.delete(deleteCommentaireDTO);
        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
    }

}
