package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Mensajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajesRepository extends JpaRepository <Mensajes, Long>{
    
}
