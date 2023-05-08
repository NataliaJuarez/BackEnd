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
public class Habilidades implements Serializable {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre; //nombre de la habilidad??? java, javascript, html, etc
    private String nivel; // nivel tipo principiante, intermedio, avanzado o long para porcentaje??

    public Habilidades() {
    }

    public Habilidades(Long id, String nombre, String nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    
}
