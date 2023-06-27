   package com.ejemplo.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HabilidadesFront implements Serializable {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre; 
    private String nivel; 
  
    public HabilidadesFront() {
    }

    public HabilidadesFront(Long id, String nombre, String nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
    }    
    
}
