package org.alfime.apoyo.domain;

import javax.persistence.*;

@Entity
public class DeportePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private DeporteActividad actividad;

    @ManyToOne
    private Mes mes;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public DeporteActividad getActividad() {
        return actividad;
    }

    public void setActividad(DeporteActividad actividad) {
        this.actividad = actividad;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }
}
