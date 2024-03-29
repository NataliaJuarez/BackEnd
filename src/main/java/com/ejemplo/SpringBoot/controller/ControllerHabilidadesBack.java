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
    
    @PostMapping ("/bhabilidad/new")
    public void agregarHabilidad (@RequestBody HabilidadesBack habiB) {
       habiBService.crearHabilidad(habiB);
    }
    
    @GetMapping ("/bhabilidades/ver")
    @ResponseBody
    public List<HabilidadesBack> verHabilidades () {
        return habiBService.verHabilidades();
    }
    
    @GetMapping ("/bhabilidad/buscar/{id}")
    public void buscarHabilidad (@PathVariable Long id) {
        habiBService.buscarHabilidad(id);
    }
    
    @DeleteMapping ("/bhabilidad/delete/{id}")
    public void eliminarHabilidad (@PathVariable Long id) {
        habiBService.eliminarHabilidad(id);
    }
    
    @PutMapping ("/bhabilidad/edit")
    public void editarHabilidad (@PathVariable Long id, @RequestBody HabilidadesBack habiB) {
        habiBService.editarHabilidad(habiB);
    }
}
