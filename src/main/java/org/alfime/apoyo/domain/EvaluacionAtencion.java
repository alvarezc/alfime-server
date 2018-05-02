package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"evaluacion_id", "atencion_tipo_id"})})
public class EvaluacionAtencion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Evaluacion evaluacion;

    @ManyToOne
    private AtencionTipo atencionTipo;

    @Column
    private Byte cantidad;

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

    public AtencionTipo getAtencionTipo() {
        return atencionTipo;
    }

    public void setAtencionTipo(AtencionTipo atencionTipo) {
        this.atencionTipo = atencionTipo;
    }

    public Byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(Byte cantidad) {
        this.cantidad = cantidad;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Frecuencia frecuencia) {
        this.frecuencia = frecuencia;
    }
}
