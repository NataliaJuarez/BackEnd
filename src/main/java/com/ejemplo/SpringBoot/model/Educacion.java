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
public class Educacion implements Serializable {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String establecimiento;
    private String titulo;
    private Long anio; //long o date?

    public Educacion() {
    }

    public Educacion(Long id, String establecimiento, String titulo, Long anio) {
        this.id = id;
        this.establecimiento = establecimiento;
        this.titulo = titulo;
        this.anio = anio;
    }
    
    
}
