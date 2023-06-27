package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Mensajes;
import com.ejemplo.SpringBoot.repository.MensajesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajesService implements IMensajesService {

    @Autowired
    public MensajesRepository msjRepo;
    
    @Override
    public void crearMensaje(Mensajes msj) {
        msjRepo.save(msj);
    }

    @Override
    public List<Mensajes> verMensajes() {
        return msjRepo.findAll();
    }

    @Override
    public void eliminarMensaje(Long id) {
        msjRepo.deleteById(id);
    }
    
}
