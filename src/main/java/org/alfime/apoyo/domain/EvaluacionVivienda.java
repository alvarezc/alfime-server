package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class EvaluacionVivienda implements Serializable {
    @Id
    private Integer id;

    @OneToOne
    @MapsId
    private Evaluacion evaluacion;

    @ManyToOne
    private ViviendaTipo tipo;

    @Column
    private Byte estrato;

    @Column
    private Byte dormitorios;

    @ManyToOne
    private ViviendaMaterial pared;

    @ManyToOne
    private ViviendaMaterial techo;

    @ManyToOne
    private ViviendaMaterial piso;

    @OneToMany(mappedBy = "evaluacion")
    private List<EvaluacionViviendaAccesibilidad> accesibilidad;

    @ManyToMany
    @JoinTable(joinColumns = {@JoinColumn(name = "evaluacion_id")}, inverseJoinColumns = {@JoinColumn(name = "mobiliario_id")})
    private List<ViviendaMobiliario> mobiliario;

    @Column
    private ViviendaMaterial calidad;

    @Column(length = 50)
    private String calidadOtro;

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

    public ViviendaTipo getTipo() {
        return tipo;
    }

    public void setTipo(ViviendaTipo tipo) {
        this.tipo = tipo;
    }

    public Byte getEstrato() {
        return estrato;
    }

    public void setEstrato(Byte estrato) {
        this.estrato = estrato;
    }

    public Byte getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(Byte dormitorios) {
        this.dormitorios = dormitorios;
    }

    public ViviendaMaterial getPared() {
        return pared;
    }

    public void setPared(ViviendaMaterial pared) {
        this.pared = pared;
    }

    public ViviendaMaterial getTecho() {
        return techo;
    }

    public void setTecho(ViviendaMaterial techo) {
        this.techo = techo;
    }

    public ViviendaMaterial getPiso() {
        return piso;
    }

    public void setPiso(ViviendaMaterial piso) {
        this.piso = piso;
    }

    public List<EvaluacionViviendaAccesibilidad> getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(List<EvaluacionViviendaAccesibilidad> accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public List<ViviendaMobiliario> getMobiliario() {
        return mobiliario;
    }

    public void setMobiliario(List<ViviendaMobiliario> mobiliario) {
        this.mobiliario = mobiliario;
    }

    public ViviendaMaterial getCalidad() {
        return calidad;
    }

    public void setCalidad(ViviendaMaterial calidad) {
        this.calidad = calidad;
    }

    public String getCalidadOtro() {
        return calidadOtro;
    }

    public void setCalidadOtro(String calidadOtro) {
        this.calidadOtro = calidadOtro;
    }
}
