package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.HabilidadesFront;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesFrontRepository extends JpaRepository <HabilidadesFront, Long> {
    
}
