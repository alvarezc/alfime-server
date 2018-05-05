package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class CifComponente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(length = 50)
    private String nombre;

    @OneToMany(mappedBy = "componente")
    private List<CifCategoria> categorias;

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

    public List<CifCategoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<CifCategoria> categorias) {
        this.categorias = categorias;
    }
}
