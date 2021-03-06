package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CifCategoria implements Serializable {
    @Id
    @GeneratedValue
    private Byte id;

    @Column(length = 50)
    private String nombre;

    @ManyToOne
    private CifComponente componente;

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

    public CifComponente getComponente() {
        return componente;
    }

    public void setComponente(CifComponente componente) {
        this.componente = componente;
    }
}
