package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.HabilidadesSoft;
import com.ejemplo.SpringBoot.repository.HabilidadesSoftRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesSoftService implements IHabilidadesSoftService {

    @Autowired
    public HabilidadesSoftRepository habiSRepo;
    
    @Override
    public List<HabilidadesSoft> verHabilidades() {
        return habiSRepo.findAll();
    }

    @Override
    public void crearHabilidad(HabilidadesSoft habiS) {
        habiSRepo.save(habiS);
    }

    @Override
    public void eliminarHabilidad(Long id) {
        habiSRepo.deleteById(id);
    }

    @Override
    public void editarHabilidad(HabilidadesSoft habiS) {
        habiSRepo.save(habiS);
    }

    @Override
    public HabilidadesSoft buscarHabilidad(Long id) {
        return habiSRepo.findById(id).orElse(null);
    }
    
}
