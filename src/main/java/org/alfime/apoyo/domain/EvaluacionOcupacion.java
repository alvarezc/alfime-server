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

    @ManyToOne
    private ActividadEconomica actividadEconomica;

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

    @Column(columnDefinition = "text")
    private String tareas;

    @Column(columnDefinition = "text")
    private String expectativas;

    @Column(columnDefinition = "text")
    private String aspiraciones;

    @Column
    private Boolean actitud1;

    @Column
    private Boolean actitud2;

    @Column
    private Boolean actitud3;

    @Column
    private Boolean actitud4;

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

    public ActividadEconomica getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(ActividadEconomica actividadEconomica) {
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

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    public String getExpectativas() {
        return expectativas;
    }

    public void setExpectativas(String expectativas) {
        this.expectativas = expectativas;
    }

    public String getAspiraciones() {
        return aspiraciones;
    }

    public void setAspiraciones(String aspiraciones) {
        this.aspiraciones = aspiraciones;
    }

    public Boolean getActitud1() {
        return actitud1;
    }

    public void setActitud1(Boolean actitud1) {
        this.actitud1 = actitud1;
    }

    public Boolean getActitud2() {
        return actitud2;
    }

    public void setActitud2(Boolean actitud2) {
        this.actitud2 = actitud2;
    }

    public Boolean getActitud3() {
        return actitud3;
    }

    public void setActitud3(Boolean actitud3) {
        this.actitud3 = actitud3;
    }

    public Boolean getActitud4() {
        return actitud4;
    }

    public void setActitud4(Boolean actitud4) {
        this.actitud4 = actitud4;
    }
}
