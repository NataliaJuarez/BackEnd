package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ControllerExperiencia {
    
    @Autowired
    public ExperienciaService expeService;
    
        @PostMapping ("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia expe) {
       // listaExperiencias.add(expe); 
       expeService.crearExperiencia(expe);
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencias () {
        return expeService.verExperiencias();
    }
    
    @DeleteMapping ("/delete/experiencia/{id}")
    public void eliminarExperiencia (@PathVariable Long id) {
        expeService.eliminarExperiencia(id);
    }
    
    @PutMapping ("/edit/experiencia")
    public void editarExperiencia (@RequestBody Experiencia expe) {
        expeService.editarExperiencia(expe);
    }
    
    
}
