package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Habilidades;
import java.util.List;

public interface IHabilidadesService {
    
    public List<Habilidades> verHabilidades();
    
    public void crearHabilidad(Habilidades habi);
    
    public void eliminarHabilidad(Long id);
    
    public void editarHabilidad(Habilidades habi);
    
    public Habilidades buscarHabilidad (Long id);
}
