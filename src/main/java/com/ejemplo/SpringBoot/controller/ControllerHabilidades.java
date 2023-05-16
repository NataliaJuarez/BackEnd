package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Habilidades;
import com.ejemplo.SpringBoot.service.HabilidadesService;
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
public class ControllerHabilidades {
    
    @Autowired
    public HabilidadesService habiService;
    
    @PostMapping ("/new/habilidad")
    public void agregarPersona (@RequestBody Habilidades habi) {
       habiService.crearHabilidad(habi);
    }
    
    @GetMapping ("/ver/habilidades")
    @ResponseBody
    public List<Habilidades> verHabilidades () {
        return habiService.verHabilidades();
    }
    
    @DeleteMapping ("/delete/habilidad/{id}")
    public void eliminarHabilidad (@PathVariable Long id) {
        habiService.eliminarHabilidad(id);
    }
    
    @PutMapping ("/edit/habilidad")
    public void editarHabilidad (@RequestBody Habilidades habi) {
        habiService.editarHabilidad(habi);
    }
    
}
