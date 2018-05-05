package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DeporteModalidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(length = 25)
    private String nombre;

    @Column(length = 15)
    private String puntuacion;

    @ManyToOne
    private DeporteCategoria categoria;

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

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public DeporteCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(DeporteCategoria categoria) {
        this.categoria = categoria;
    }
}
