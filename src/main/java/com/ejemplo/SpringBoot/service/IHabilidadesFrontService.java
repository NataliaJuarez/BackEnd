package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.HabilidadesFront;
import java.util.List;

public interface IHabilidadesFrontService {
    
    public List<HabilidadesFront> verHabilidades();
    
    public void crearHabilidad(HabilidadesFront habi);
    
    public void eliminarHabilidad(Long id);
    
    public void editarHabilidad(HabilidadesFront habi);
    
    public HabilidadesFront buscarHabilidad (Long id);
}
