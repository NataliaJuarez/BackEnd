package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Proyectos;
import com.ejemplo.SpringBoot.service.ProyectosService;
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
@CrossOrigin(origins = "https://localhost:4200/")
public class ControllerProyectos {
    
    @Autowired
    public ProyectosService proyeService;
    
    @PostMapping ("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyectos proye) { 
       proyeService.crearProyecto(proye);
    }
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos () {
        return proyeService.verProyectos();
    }
    
    @DeleteMapping ("/delete/proyecto/{id}")
    public void eliminarProyecto (@PathVariable Long id) {
        proyeService.eliminarProyecto(id);
    }
    @PutMapping ("/edit/proyecto")
    public void editarProyecto (@RequestBody Proyectos proye) {
        proyeService.editarProyecto(proye);
    }
}
