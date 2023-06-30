package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.HabilidadesFront;
import com.ejemplo.SpringBoot.service.HabilidadesFrontService;
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
public class ControllerHabilidadesFront {
    
    @Autowired
    public HabilidadesFrontService habiService;
    
    @PostMapping ("/habilidad/new")
    public void agregarHabilidad (@RequestBody HabilidadesFront habi) {
       habiService.crearHabilidad(habi);
    }
    
    @GetMapping ("/habilidades/ver")
    @ResponseBody
    public List<HabilidadesFront> verHabilidades () {
        return habiService.verHabilidades();
    }
    
    @GetMapping ("/habilidad/buscar/{id}")
    public void buscarHabilidad (@PathVariable Long id) {
        habiService.buscarHabilidad(id);
    }
    
    @DeleteMapping ("/habilidad/delete/{id}")
    public void eliminarHabilidad (@PathVariable Long id) {
        habiService.eliminarHabilidad(id);
    }
    
    @PutMapping ("/habilidad/edit/{id}")
    public void editarHabilidad (@PathVariable Long id, @RequestBody HabilidadesFront habi) {
        habiService.editarHabilidad(habi);
    }
    
}
