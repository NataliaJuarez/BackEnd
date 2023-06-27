package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.HabilidadesSoft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesSoftRepository extends JpaRepository <HabilidadesSoft, Long>{
    
}
