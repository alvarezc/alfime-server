package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class EvaluacionOcupacion implements Serializable {
    @Id
    private Integer id;

    @OneToOne
    @MapsId
    private Evaluacion evaluacion;

    @ManyToOne
    private Ocupacion ocupacion;

    @ManyToOne
    private Escolaridad escolaridad;

    @ManyToOne
    private ActividadEconomica actividadEconomica;

    @Column(length = 100)
    private String empresa;

    @Column(length = 20)
    private String telefono;

    @Column(columnDefinition = "text")
    private String rutinaDiaria;

    @Column(columnDefinition = "text")
    private String actividadesTiempoLibre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.evaluacion")
    private Set<EvaluacionIngreso> ingresos;
}
