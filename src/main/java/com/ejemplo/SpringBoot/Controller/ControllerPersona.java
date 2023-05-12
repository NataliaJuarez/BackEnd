package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-natalia.web.app/")
public class ControllerPersona {
    
    @Autowired
    public PersonaService persoService;            
 /*   //metodo get
    @GetMapping ("/hola/{nombre}/{apellido}/{edad}")
    public String decirHola(@PathVariable String nombre,
                            @PathVariable String apellido,
                            @PathVariable int edad) {
        return "Hola mundo " + nombre + " apellido: " + apellido + " edad: " + edad;
    }
    
    @GetMapping ("/chau")
    public String decirChau (@RequestParam String nombre,
                            @RequestParam String apellido,
                            @RequestParam int edad) {
        return "Chau mundo " +  nombre + " apellido: " + apellido + " edad: " + edad;
    } */
    
    //método POST
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
       // listaPersonas.add(pers); 
       persoService.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoService.verPersonas();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void eliminarPersona (@PathVariable Long id) {
        persoService.eliminarPersona(id);
    }
    
    @PutMapping ("/edit/persona")
    public void editarPersona (@RequestBody Persona pers) {
        persoService.editarPersona(pers);
    }
    
    @GetMapping ("/ver/miperfil")
    public Persona verMiPerfil() {
        return persoService.buscarPersona((long) 1);
    }
}
