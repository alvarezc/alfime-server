package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class EvaluacionOcupacion implements Serializable {
    @Id
    private Integer id;

    @OneToOne
    @MapsId
    private Evaluacion evaluacion;

    @ManyToOne
    private Ocupacion ocupacion;

    @ManyToOne
    private Escolaridad escolaridad;

    @Column(length = 100)
    private String actividadEconomica;

    @Column(length = 100)
    private String empresa;

    @Column(length = 20)
    private String telefono;

    @Column(columnDefinition = "text")
    private String rutinaDiaria;

    @Column(columnDefinition = "text")
    private String actividadesTiempoLibre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "evaluacion")
    private Set<EvaluacionIngreso> ingresos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Ocupacion getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(Ocupacion ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Escolaridad getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(Escolaridad escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRutinaDiaria() {
        return rutinaDiaria;
    }

    public void setRutinaDiaria(String rutinaDiaria) {
        this.rutinaDiaria = rutinaDiaria;
    }

    public String getActividadesTiempoLibre() {
        return actividadesTiempoLibre;
    }

    public void setActividadesTiempoLibre(String actividadesTiempoLibre) {
        this.actividadesTiempoLibre = actividadesTiempoLibre;
    }

    public Set<EvaluacionIngreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(Set<EvaluacionIngreso> ingresos) {
        this.ingresos = ingresos;
    }
}
