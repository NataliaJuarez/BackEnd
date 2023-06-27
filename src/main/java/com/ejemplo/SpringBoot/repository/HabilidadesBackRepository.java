package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.HabilidadesBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesBackRepository extends JpaRepository <HabilidadesBack, Long>{
    
}
