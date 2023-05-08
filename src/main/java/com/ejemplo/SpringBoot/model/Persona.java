package com.ejemplo.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter   //anotaciones que permiten no tener que escribir todos los getters y setters
@Entity
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String profesion;
    private String ciudad;
    private String pais;
    private String about;
    private String imagendeperfil;
    
    public Persona() {        
    }

    public Persona(Long id, String nombre, String apellido, String profesion, String ciudad, String pais, String about, String imagendeperfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.about = about;
        this.imagendeperfil = imagendeperfil;
    }
    

    
}
