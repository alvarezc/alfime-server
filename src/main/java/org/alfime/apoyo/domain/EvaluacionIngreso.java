package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"evaluacion_id", "ingreso_id"})})
public class EvaluacionIngreso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Evaluacion evaluacion;

    @ManyToOne
    private Ingreso ingreso;

    @Column
    private Double monto;

    @ManyToOne
    private Frecuencia frecuencia;

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

    public Ingreso getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Frecuencia frecuencia) {
        this.frecuencia = frecuencia;
    }
}
