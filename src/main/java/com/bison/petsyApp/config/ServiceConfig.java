package com.bison.petsyApp.config;

import com.bison.petsyApp.repositories.UtilisateurRepository;
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
    public UtilisateurService clientService(UtilisateurRepository repository, ModelMapper mapper) {
        return new UtilisateurService(repository, mapper);
    }

}
