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
public class Experiencia implements Serializable {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String empresa;
    private String puesto;
    private Long año;    // es long o es date ?

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String puesto, Long año) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.año = año;
    }  
    
}
