package com.pr7.crudsbang.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ciudad")

public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    // CONSTRUCTOR
    public Ciudad(){}

    public Ciudad(int id, String nombre, Pais pais) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    // GETTER AND SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
