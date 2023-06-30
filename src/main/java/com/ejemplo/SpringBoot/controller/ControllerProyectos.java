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
@CrossOrigin(origins = "https://portfolio-natalia.web.app/")
public class ControllerProyectos {
    
    @Autowired
    public ProyectosService proyeService;
    
    @PostMapping ("/proyecto/new")
    public void agregarProyecto (@RequestBody Proyectos proye) { 
       proyeService.crearProyecto(proye);
    }
    
    @GetMapping ("/proyectos/ver")
    @ResponseBody
    public List<Proyectos> verProyectos () {
        return proyeService.verProyectos();
    }
    
    @GetMapping ("/proyectos/buscar/{id}")
    public void buscarProyecto (@PathVariable Long id) {
        proyeService.buscarProyecto(id);
    }
        
    @DeleteMapping ("/proyecto/delete/{id}")
    public void eliminarProyecto (@PathVariable Long id) {
        proyeService.eliminarProyecto(id);
    }
    @PutMapping ("/proyecto/edit/{id}")
    public void editarProyecto (@PathVariable Long id, @RequestBody Proyectos proye) {
        proyeService.editarProyecto(proye);
    }
}
