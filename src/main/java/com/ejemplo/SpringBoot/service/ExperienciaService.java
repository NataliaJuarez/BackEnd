package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> verExperiencias() {
        return expeRepo.findAll();
    }
    
    @Override
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void eliminarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public void editarExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    } 

    @Override
    public Experiencia buscarExperiencia(Long id) {
       return expeRepo.findById(id).orElse(null);
    }
    
}
