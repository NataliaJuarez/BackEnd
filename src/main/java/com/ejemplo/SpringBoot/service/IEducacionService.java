package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion edu);
    
    public void eliminarEducacion(Long id);
    
    public void editarEducacion(Educacion edu);
    
    public Educacion buscarEducacion (Long id);
    
    
}
