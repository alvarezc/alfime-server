package org.alfime.apoyo.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class SeccionData extends Auditable implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "text")
    private String contenido;

    @ManyToOne
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
