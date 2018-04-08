package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AssociationOverrides({
        @AssociationOverride(name = "pk.evaluacion", joinColumns = @JoinColumn(name = "evaluacion_id")),
        @AssociationOverride(name = "pk.ingreso", joinColumns = @JoinColumn(name = "ingreso_id"))
})
public class EvaluacionIngreso implements Serializable {
    @EmbeddedId
    private EvaluacionIngresoPK pk = new EvaluacionIngresoPK();

    @Column
    private Double monto;

    @ManyToOne
    private Frecuencia frecuencia;
}
