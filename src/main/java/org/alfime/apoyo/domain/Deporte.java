package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Deporte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(length = 50)
    private String nombre;

    @OneToMany(mappedBy = "deporte")
    private List<DeporteCategoria> categorias;

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

    public List<DeporteCategoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<DeporteCategoria> categorias) {
        this.categorias = categorias;
    }
}
