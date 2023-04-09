package com.pr7.crudsbang.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "pais")

public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;

    // CONTRUCTOR
    public Pais() {
    }

    public Pais(String nombre) {
        super();
        this.nombre = nombre;
    }

    // GETTER AND SETTER
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
