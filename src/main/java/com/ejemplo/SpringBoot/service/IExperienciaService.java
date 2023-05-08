package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias();
    
    public void crearExperiencia(Experiencia expe);
    
    public void eliminarExperiencia(Long id);
    
    public void editarExperiencia(Experiencia expe);
    
    public Experiencia buscarExperiencia (Long id);
    
}
