package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ViviendaMaterial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Byte seccion;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Byte getSeccion() {
        return seccion;
    }

    public void setSeccion(Byte seccion) {
        this.seccion = seccion;
    }
}
