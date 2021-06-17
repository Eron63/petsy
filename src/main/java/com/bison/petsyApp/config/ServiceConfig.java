package com.bison.petsyApp.config;

import com.bison.petsyApp.repositories.AnimalRepository;
import com.bison.petsyApp.repositories.CommentaireRepository;
import com.bison.petsyApp.repositories.PetsyRepository;
import com.bison.petsyApp.repositories.PhotoRepository;
import com.bison.petsyApp.repositories.UtilisateurRepository;
import com.bison.petsyApp.services.AnimalService;
import com.bison.petsyApp.services.CommentaireService;
import com.bison.petsyApp.services.PetsyService;
import com.bison.petsyApp.services.PhotoService;
import com.bison.petsyApp.services.TypeService;
import com.bison.petsyApp.services.UtilisateurService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class ServiceConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UtilisateurService utilisateurService(UtilisateurRepository repository, ModelMapper mapper) {
        return new UtilisateurService(repository, mapper);
    }
    
    @Bean
    public AnimalService animalService(AnimalRepository repository, ModelMapper mapper) {
        return new AnimalService(repository, mapper);
    }
    
    @Bean
    public CommentaireService commentaireService(CommentaireRepository repository, ModelMapper mapper) {
        return new CommentaireService(repository, mapper);
    }
    
    @Bean
    public PetsyService petsyService(PetsyRepository repository, ModelMapper mapper) {
        return new PetsyService(repository, mapper);
    }
    
    @Bean
    public PhotoService photoService(PhotoRepository repository, ModelMapper mapper) {
        return new PhotoService(repository, mapper);
    }
    
    @Bean
    public TypeService typeService(TypeRepository repository, ModelMapper mapper) {
        return new TypeService(repository, mapper);
    }

}
