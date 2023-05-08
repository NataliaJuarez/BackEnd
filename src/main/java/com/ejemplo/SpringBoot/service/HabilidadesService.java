package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Habilidades;
import com.ejemplo.SpringBoot.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService {
    
    @Autowired
    public HabilidadesRepository habiRepo;
    
    @Override
    public List<Habilidades> verHabilidades() {
        return habiRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidades habi) {
        habiRepo.save(habi);
    }

    @Override
    public void eliminarHabilidad(Long id) {
        habiRepo.deleteById(id);
    }

    @Override
    public void editarHabilidad(Habilidades habi) {
        habiRepo.save(habi);
    }

    @Override
    public Habilidades buscarHabilidad(Long id) {
        return habiRepo.findById(id).orElse(null);
    }
    
}
