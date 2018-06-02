package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class EvaluacionPsicologico implements Serializable {
    @Id
    private Integer id;

    @OneToOne
    @MapsId
    private Evaluacion evaluacion;

    @Column(columnDefinition = "text")
    private String comportamiento;

    @Column(columnDefinition = "text")
    private String estadoEmocional;

    @Column(columnDefinition = "text")
    private String diagnosticoSocial;

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

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getEstadoEmocional() {
        return estadoEmocional;
    }

    public void setEstadoEmocional(String estadoEmocional) {
        this.estadoEmocional = estadoEmocional;
    }

    public String getDiagnosticoSocial() {
        return diagnosticoSocial;
    }

    public void setDiagnosticoSocial(String diagnosticoSocial) {
        this.diagnosticoSocial = diagnosticoSocial;
    }
}
