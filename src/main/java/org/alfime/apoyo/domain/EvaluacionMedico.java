package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class EvaluacionMedico implements Serializable {
    @Id
    private Integer id;

    @OneToOne
    @MapsId
    private Evaluacion evaluacion;

    @OneToMany(mappedBy = "evaluacion")
    private Set<EvaluacionDiscapacidad> discapacidades;

    @Column(columnDefinition = "text")
    private String recomendaciones;

    @Column(columnDefinition = "text")
    private String sinopsis;

    @ManyToMany
    @JoinTable(joinColumns = {@JoinColumn(name = "evaluacion_id")}, inverseJoinColumns = {@JoinColumn(name = "cie_id")})
    private List<CIE> diagnostico;

    @ManyToMany
    @JoinTable(joinColumns = {@JoinColumn(name = "evaluacion_id")}, inverseJoinColumns = {@JoinColumn(name = "cie_id")})
    private List<CIE> familiar;

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

    public Set<EvaluacionDiscapacidad> getDiscapacidades() {
        return discapacidades;
    }

    public void setDiscapacidades(Set<EvaluacionDiscapacidad> discapacidades) {
        this.discapacidades = discapacidades;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public List<CIE> getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(List<CIE> diagnostico) {
        this.diagnostico = diagnostico;
    }

    public List<CIE> getFamiliar() {
        return familiar;
    }

    public void setFamiliar(List<CIE> familiar) {
        this.familiar = familiar;
    }
}
