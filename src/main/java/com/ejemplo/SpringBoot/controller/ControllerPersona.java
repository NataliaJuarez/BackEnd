package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-natalia.web.app/")
public class ControllerPersona {
    
    @Autowired
    public PersonaService persoService;            
     
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoService.verPersonas();
    }
        
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/persona/edit")
    public void editarPersona (@RequestBody Persona pers) {
        persoService.editarPersona(pers);
    }
    
    @GetMapping ("/ver/miperfil")
    public Persona verMiPerfil() {
        return persoService.buscarPersona((long) 1);
    }
}
