package com.bison.petsyApp.controllers;

import com.bison.petsyApp.services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("commentaires")
public class CommentaireController {


    @Autowired
    private CommentaireService service;



}
