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
    
    @PostMapping ("/new/habilidad")
    public void agregarHabilidad (@RequestBody HabilidadesFront habi) {
       habiService.crearHabilidad(habi);
    }
    
    @GetMapping ("/ver/habilidades")
    @ResponseBody
    public List<HabilidadesFront> verHabilidades () {
        return habiService.verHabilidades();
    }
    
    @DeleteMapping ("/delete/habilidad/{id}")
    public void eliminarHabilidad (@PathVariable Long id) {
        habiService.eliminarHabilidad(id);
    }
    
    @PutMapping ("/edit/habilidad")
    public void editarHabilidad (@RequestBody HabilidadesFront habi) {
        habiService.editarHabilidad(habi);
    }
    
}
