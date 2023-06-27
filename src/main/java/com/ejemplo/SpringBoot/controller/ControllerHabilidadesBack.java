package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.HabilidadesBack;
import com.ejemplo.SpringBoot.service.HabilidadesBackService;
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
public class ControllerHabilidadesBack {
    
    @Autowired
    public HabilidadesBackService habiBService;
    
    @PostMapping ("/new/bhabilidad")
    public void agregarHabilidad (@RequestBody HabilidadesBack habiB) {
       habiBService.crearHabilidad(habiB);
    }
    
    @GetMapping ("/ver/bhabilidades")
    @ResponseBody
    public List<HabilidadesBack> verHabilidades () {
        return habiBService.verHabilidades();
    }
    
    @DeleteMapping ("/delete/bhabilidad/{id}")
    public void eliminarHabilidad (@PathVariable Long id) {
        habiBService.eliminarHabilidad(id);
    }
    
    @PutMapping ("/edit/bhabilidad")
    public void editarHabilidad (@RequestBody HabilidadesBack habiB) {
        habiBService.editarHabilidad(habiB);
    }
}
