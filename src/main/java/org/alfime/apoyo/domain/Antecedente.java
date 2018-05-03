package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Antecedente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(length = 20)
    private String nombre;

    @OneToMany(mappedBy = "antecedente")
    private List<AntecedenteCategoria> categorias;

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

    public List<AntecedenteCategoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<AntecedenteCategoria> categorias) {
        this.categorias = categorias;
    }
}
