package com.proyectohome.app.apirest.Model;

import jakarta.persistence.*;

@Entity
@Table(schema = "TaskCrud")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String titulo;
    @Column
    private String descripcion;

    public long getId() {
        return id;
    }
    public void setId(long id) {

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
