package com.ejemplo.SpringBoot.security.service;

import com.ejemplo.SpringBoot.security.model.Rol;
import com.ejemplo.SpringBoot.security.enums.RolNombre;
import com.ejemplo.SpringBoot.security.repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);   
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
