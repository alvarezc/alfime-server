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

    @Column
    private Byte asistencia1;

    @Column
    private Byte frecuencia1;

    @Column
    private Byte asistencia2;

    @Column
    private Byte frecuencia2;

    @Column
    private Byte asistencia3;

    @Column
    private Byte frecuencia3;

    @Column
    private Byte asistencia4;

    @Column
    private Byte frecuencia4;

    @Column
    private Byte asistencia5;

    @Column
    private Byte frecuencia5;

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

    public Byte getAsistencia1() {
        return asistencia1;
    }

    public void setAsistencia1(Byte asistencia1) {
        this.asistencia1 = asistencia1;
    }

    public Byte getFrecuencia1() {
        return frecuencia1;
    }

    public void setFrecuencia1(Byte frecuencia1) {
        this.frecuencia1 = frecuencia1;
    }

    public Byte getAsistencia2() {
        return asistencia2;
    }

    public void setAsistencia2(Byte asistencia2) {
        this.asistencia2 = asistencia2;
    }

    public Byte getFrecuencia2() {
        return frecuencia2;
    }

    public void setFrecuencia2(Byte frecuencia2) {
        this.frecuencia2 = frecuencia2;
    }

    public Byte getAsistencia3() {
        return asistencia3;
    }

    public void setAsistencia3(Byte asistencia3) {
        this.asistencia3 = asistencia3;
    }

    public Byte getFrecuencia3() {
        return frecuencia3;
    }

    public void setFrecuencia3(Byte frecuencia3) {
        this.frecuencia3 = frecuencia3;
    }

    public Byte getAsistencia4() {
        return asistencia4;
    }

    public void setAsistencia4(Byte asistencia4) {
        this.asistencia4 = asistencia4;
    }

    public Byte getFrecuencia4() {
        return frecuencia4;
    }

    public void setFrecuencia4(Byte frecuencia4) {
        this.frecuencia4 = frecuencia4;
    }

    public Byte getAsistencia5() {
        return asistencia5;
    }

    public void setAsistencia5(Byte asistencia5) {
        this.asistencia5 = asistencia5;
    }

    public Byte getFrecuencia5() {
        return frecuencia5;
    }

    public void setFrecuencia5(Byte frecuencia5) {
        this.frecuencia5 = frecuencia5;
    }
}
