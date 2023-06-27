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
    
    @PostMapping ("/new/shabilidad")
    public void agregarHabilidad (@RequestBody HabilidadesSoft habiS) {
       habiSService.crearHabilidad(habiS);
    }
    
    @GetMapping ("/ver/shabilidades")
    @ResponseBody
    public List<HabilidadesSoft> verHabilidades () {
        return habiSService.verHabilidades();
    }
    
    @DeleteMapping ("/delete/shabilidad/{id}")
    public void eliminarHabilidad (@PathVariable Long id) {
        habiSService.eliminarHabilidad(id);
    }
    
    @PutMapping ("/edit/shabilidad")
    public void editarHabilidad (@RequestBody HabilidadesSoft habiS) {
        habiSService.editarHabilidad(habiS);
    }
    
}
