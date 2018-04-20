package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String nombre;

    @ManyToMany(mappedBy = "roles")
    private Set<Asociado> asociados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Asociado> getAsociados() {
        return asociados;
    }

    public void setAsociados(Set<Asociado> asociados) {
        this.asociados = asociados;
    }
}
