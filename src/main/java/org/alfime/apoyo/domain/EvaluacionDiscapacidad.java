package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AssociationOverrides({
        @AssociationOverride(name = "pk.evaluacion", joinColumns = @JoinColumn(name = "evaluacion_id")),
        @AssociationOverride(name = "pk.discapacidad", joinColumns = @JoinColumn(name = "discapacidad_id"))
})
public class EvaluacionDiscapacidad implements Serializable {
    @EmbeddedId
    private EvaluacionDiscapacidadPK pk = new EvaluacionDiscapacidadPK();

    @Column
    private Boolean congenita;

    @Column
    private Date adquisicion;
}
