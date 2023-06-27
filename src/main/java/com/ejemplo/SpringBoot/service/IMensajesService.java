package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Mensajes;
import java.util.List;

public interface IMensajesService {
    
    public List<Mensajes> verMensajes();
    
    public void crearMensaje(Mensajes msj);
    
    public void eliminarMensaje(Long id);
}
