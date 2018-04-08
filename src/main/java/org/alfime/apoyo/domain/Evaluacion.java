package org.alfime.apoyo.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Evaluacion implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private boolean aceptado;

    @Column(columnDefinition = "text")
    private String observaciones;

    @Column(columnDefinition = "text")
    private String conclusiones;

    @ManyToMany
    @JoinTable(inverseJoinColumns = @JoinColumn(name = "programa_id"))
    private List<Programa> plan;

    @ManyToMany
    @JoinTable(inverseJoinColumns = @JoinColumn(name = "programa_id"))
    private List<Programa> aspiracion;

    @ManyToOne
    Remitente remitente;

    @OneToOne(mappedBy = "evaluacion")
    EvaluacionFamilia familia;

    @Embedded
    Audit audit;
}
