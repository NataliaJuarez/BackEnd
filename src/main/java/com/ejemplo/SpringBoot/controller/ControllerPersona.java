package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://localhost:4200/")
public class ControllerPersona {
    
    @Autowired
    public PersonaService persoService;            

    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
       // listaPersonas.add(pers); 
       persoService.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoService.verPersonas();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void eliminarPersona (@PathVariable Long id) {
        persoService.eliminarPersona(id);
    }
    
    @PutMapping ("/edit/persona")
    public void editarPersona (@RequestBody Persona pers) {
        persoService.editarPersona(pers);
    }
    
    @GetMapping ("/ver/miperfil")
    public Persona verMiPerfil() {
        return persoService.buscarPersona((long) 1);
    }
}