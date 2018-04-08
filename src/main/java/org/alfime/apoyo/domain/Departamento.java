package org.alfime.apoyo.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departamento {
    @Id
    @GeneratedValue
    private Byte id;

    @Column(length = 50)
    private String departamento;

    @JsonManagedReference
    @OneToMany(mappedBy = "departamento", fetch = FetchType.LAZY)
    private List<Ciudad> ciudades;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
