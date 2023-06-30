package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.HabilidadesSoft;
import com.ejemplo.SpringBoot.service.HabilidadesSoftService;
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
@CrossOrigin(origins = "https://portfolio-natalia.web.app/")
public class ControllerHabilidadesSoft {
    
    @Autowired
    public HabilidadesSoftService habiSService;
    
    @PostMapping ("/shabilidad/new")
    public void agregarHabilidad (@RequestBody HabilidadesSoft habiS) {
       habiSService.crearHabilidad(habiS);
    }
    
    @GetMapping ("/shabilidades/ver")
    @ResponseBody
    public List<HabilidadesSoft> verHabilidades () {
        return habiSService.verHabilidades();
    }
    
    @GetMapping ("/shabilidad/buscar/{id}") 
    public void buscarHabilidad (@PathVariable Long id) {
        habiSService.buscarHabilidad(id);
    }
    
    @DeleteMapping ("/shabilidad/delete/{id}")
    public void eliminarHabilidad (@PathVariable Long id) {
        habiSService.eliminarHabilidad(id);
    }
    
    @PutMapping ("/shabilidad/edit/{id}")
    public void editarHabilidad (@PathVariable Long id, @RequestBody HabilidadesSoft habiS) {
        habiSService.editarHabilidad(habiS);
    }
    
}
