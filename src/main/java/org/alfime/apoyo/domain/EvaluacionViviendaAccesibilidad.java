package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class EvaluacionViviendaAccesibilidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Evaluacion evaluacion;

    @ManyToOne
    private ViviendaAccesibilidad accesibilidad;

    @Column
    private Byte calificacion;

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

    public ViviendaAccesibilidad getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(ViviendaAccesibilidad accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public Byte getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Byte calificacion) {
        this.calificacion = calificacion;
    }
}
