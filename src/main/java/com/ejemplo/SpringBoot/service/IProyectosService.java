package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Proyectos;
import java.util.List;

public interface IProyectosService {
    
    public List<Proyectos> verProyectos();
    
    public void crearProyecto(Proyectos proye);
    
    public void eliminarProyecto(Long id);
    
    public void editarProyecto(Proyectos proye);
    
    public Proyectos buscarProyecto (Long id);  
        
}
