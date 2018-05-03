package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CifItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    @Column(length = 5)
    private String codigo;

    @Column(length = 50)
    private String nombre;

    @ManyToOne
    private CifCategoria categoria;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CifCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(CifCategoria categoria) {
        this.categoria = categoria;
    }
}
