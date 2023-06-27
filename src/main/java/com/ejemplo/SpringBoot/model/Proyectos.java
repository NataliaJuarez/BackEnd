    package com.ejemplo.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Proyectos implements Serializable {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String imagenproyecto;
    private String github;
    private String url;      

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String imagenproyecto, String github, String url) {
        this.id = id;
        this.nombre = nombre;
        this.imagenproyecto = imagenproyecto;
        this.github = github;
        this.url = url;
    }
    
    
}
