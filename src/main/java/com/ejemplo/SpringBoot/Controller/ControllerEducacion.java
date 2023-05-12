package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.service.EducacionService;
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
public class ControllerEducacion {
    
    @Autowired
    public EducacionService eduService;
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu) {
       // listaExperiencias.add(expe); 
       eduService.crearEducacion(edu); 
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduService.verEducacion();    
    }
    
    @DeleteMapping ("/delete/educacion/{id}")
    public void eliminarEducacion (@PathVariable Long id) {
        eduService.eliminarEducacion(id);
    }
    
    @PutMapping ("/edit/educacion")
    public void editarEducacion (@RequestBody Educacion edu) {
        eduService.editarEducacion(edu);
    }
    
}
