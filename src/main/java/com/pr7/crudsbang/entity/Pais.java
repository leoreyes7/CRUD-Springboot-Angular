package com.pr7.crudsbang.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "pais")

public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int nombre;

    // CONTRUCTOR
    public Pais(int nombre) {
        this.nombre = nombre;
    }

    // GETTER AND SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
}
