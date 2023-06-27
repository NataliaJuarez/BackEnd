package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.HabilidadesSoft;
import java.util.List;

public interface IHabilidadesSoftService {
    
    public List<HabilidadesSoft> verHabilidades();
    
    public void crearHabilidad(HabilidadesSoft habiS);
    
    public void eliminarHabilidad(Long id);
    
    public void editarHabilidad(HabilidadesSoft habiS);
    
    public HabilidadesSoft buscarHabilidad (Long id);
}
