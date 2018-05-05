package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class CifCategoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(length = 50)
    private String nombre;

    @ManyToOne
    private CifComponente componente;

    @OneToMany(mappedBy = "categoria")
    private List<CifItem> items;

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

    public List<CifItem> getItems() {
        return items;
    }

    public void setItems(List<CifItem> items) {
        this.items = items;
    }
}
