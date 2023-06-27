package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.HabilidadesFront;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejemplo.SpringBoot.repository.HabilidadesFrontRepository;

@Service
public class HabilidadesFrontService implements IHabilidadesFrontService {
    
    @Autowired
    public HabilidadesFrontRepository habiRepo;
    
    @Override
    public List<HabilidadesFront> verHabilidades() {
        return habiRepo.findAll();
    }

    @Override
    public void crearHabilidad(HabilidadesFront habi) {
        habiRepo.save(habi);
    }

    @Override
    public void eliminarHabilidad(Long id) {
        habiRepo.deleteById(id);
    }

    @Override
    public void editarHabilidad(HabilidadesFront habi) {
        habiRepo.save(habi);
    }

    @Override
    public HabilidadesFront buscarHabilidad(Long id) {
        return habiRepo.findById(id).orElse(null);
    }
    
}
