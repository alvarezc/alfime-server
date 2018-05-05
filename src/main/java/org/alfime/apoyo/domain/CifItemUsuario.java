package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CifItemUsuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CifItem item;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private CifCalificador calificador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CifItem getItem() {
        return item;
    }

    public void setItem(CifItem item) {
        this.item = item;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public CifCalificador getCalificador() {
        return calificador;
    }

    public void setCalificador(CifCalificador calificador) {
        this.calificador = calificador;
    }
}
