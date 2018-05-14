package org.alfime.apoyo.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class SeccionData implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition="text")
    private String contenido;

    @ManyToOne
    private Seccion seccion;

    @ManyToOne
    private SeccionTipo tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public SeccionTipo getTipo() {
        return tipo;
    }

    public void setTipo(SeccionTipo tipo) {
        this.tipo = tipo;
    }
}
