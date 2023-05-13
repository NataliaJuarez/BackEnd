package com.ejemplo.SpringBoot.security.repository;

import com.ejemplo.SpringBoot.security.model.Rol;
import com.ejemplo.SpringBoot.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Long> {  //no me toma interger
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
