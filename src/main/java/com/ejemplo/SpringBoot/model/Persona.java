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
    private String fotoperfil;
    private String imagenbanner;
    private String about;
    private String ciudad;
    private String provincia;
    private String pais;
    private String mail;
    private String redsocial;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String profesion, String fotoperfil, String imagenbanner, String about, String ciudad, String provincia, String pais, String mail, String redsocial) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.fotoperfil = fotoperfil;
        this.imagenbanner = imagenbanner;
        this.about = about;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.mail = mail;
        this.redsocial = redsocial;
    }
    
}
