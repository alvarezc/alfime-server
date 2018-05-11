package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class AgendaCategoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private List<AgendaEvento> eventos;

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

    public List<AgendaEvento> getEventos() {
        return eventos;
    }

    public void setEventos(List<AgendaEvento> eventos) {
        this.eventos = eventos;
    }
}
