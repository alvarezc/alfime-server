package org.alfime.apoyo.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Seccion implements Serializable {
    @Id
    @GeneratedValue
    private Byte id;

    @Column(length = 20)
    private String nombre;

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
}
