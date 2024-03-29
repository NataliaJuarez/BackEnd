package com.ejemplo.SpringBoot.security.repository;

import com.ejemplo.SpringBoot.security.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> { //no me toma interger
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String Email);
    
}
