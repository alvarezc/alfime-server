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

    @ManyToMany
    private List<CifItem> items;

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

    public List<CifItem> getItems() {
        return items;
    }

    public void setItems(List<CifItem> items) {
        this.items = items;
    }
}
