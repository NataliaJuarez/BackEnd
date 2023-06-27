package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.HabilidadesBack;
import com.ejemplo.SpringBoot.repository.HabilidadesBackRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesBackService implements IHabilidadesBackService {

    @Autowired
    public HabilidadesBackRepository habiBRepo;
    
    @Override
    public List<HabilidadesBack> verHabilidades() {
        return habiBRepo.findAll();
    }

    @Override
    public void crearHabilidad(HabilidadesBack habiB) {
        habiBRepo.save(habiB);
    }

    @Override
    public void eliminarHabilidad(Long id) {
        habiBRepo.deleteById(id);
    }

    @Override
    public void editarHabilidad(HabilidadesBack habiB) {
        habiBRepo.save(habiB);
    }

    @Override
    public HabilidadesBack buscarHabilidad(Long id) {
        return habiBRepo.findById(id).orElse(null);
    }
    
}
