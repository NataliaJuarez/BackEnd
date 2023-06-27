package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Mensajes;
import com.ejemplo.SpringBoot.service.MensajesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-natalia.web.app/")
public class ControllerMensajes {
    
    @Autowired
    public MensajesService msjService;
    
    @PostMapping ("/new/mensaje")
    public void enviarMensaje (@RequestBody Mensajes msj) {
       // listaPersonas.add(pers); 
       msjService.crearMensaje(msj);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/ver/mensajes")
    @ResponseBody
    public List<Mensajes> verMensajes () {
        return msjService.verMensajes();
    }
    
    @PreAuthorize("hasRole('ADMIN')")    
    @DeleteMapping ("/delete/mensaje/{id}")
    public void eliminarMensaje (@PathVariable Long id) {
        msjService.eliminarMensaje(id);
    }
}
