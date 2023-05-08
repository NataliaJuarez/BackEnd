package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Proyectos;
import com.ejemplo.SpringBoot.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    public ProyectosRepository proyeRepo;
    
    @Override
    public List<Proyectos> verProyectos() {
        return proyeRepo.findAll();
    }
    
    @Override
    public void crearProyecto(Proyectos proye) {
        proyeRepo.save(proye);
    }
    
    @Override
    public void eliminarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }
    
    @Override
    public void editarProyecto(Proyectos proye) {
        proyeRepo.save(proye);
    }
    
    @Override
    public Proyectos buscarProyecto(Long id) {
        return proyeRepo.findById(id).orElse(null);
    }
    
}
