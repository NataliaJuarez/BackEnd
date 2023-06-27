package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.HabilidadesBack;
import java.util.List;

public interface IHabilidadesBackService {
    
    public List<HabilidadesBack> verHabilidades();
    
    public void crearHabilidad(HabilidadesBack habiB);
    
    public void eliminarHabilidad(Long id);
    
    public void editarHabilidad(HabilidadesBack habiB);
    
    public HabilidadesBack buscarHabilidad (Long id);
}
