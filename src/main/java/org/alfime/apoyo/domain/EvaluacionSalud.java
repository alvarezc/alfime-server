package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class EvaluacionSalud implements Serializable {
    @Id
    private Integer id;

    @OneToOne
    @MapsId
    private Evaluacion evaluacion;

    @ManyToOne
    private Regimen regimen;

    @ManyToOne
    private EPS eps;

    @ManyToOne
    private CajaCompensacion cajaCompensacion;

    @ManyToOne
    private Pension fondoPension;

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

    public Regimen getRegimen() {
        return regimen;
    }

    public void setRegimen(Regimen regimen) {
        this.regimen = regimen;
    }

    public EPS getEps() {
        return eps;
    }

    public void setEps(EPS eps) {
        this.eps = eps;
    }

    public CajaCompensacion getCajaCompensacion() {
        return cajaCompensacion;
    }

    public void setCajaCompensacion(CajaCompensacion cajaCompensacion) {
        this.cajaCompensacion = cajaCompensacion;
    }

    public Pension getFondoPension() {
        return fondoPension;
    }

    public void setFondoPension(Pension fondoPension) {
        this.fondoPension = fondoPension;
    }
}
