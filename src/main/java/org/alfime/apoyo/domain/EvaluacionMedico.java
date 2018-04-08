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

    @OneToMany(mappedBy = "pk.evaluacion")
    private Set<EvaluacionDiscapacidad> discapacidades;

    @ManyToMany
    private List<CifItem> items;
}
