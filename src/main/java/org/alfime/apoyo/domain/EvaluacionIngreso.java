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

    public EvaluacionIngresoPK getPk() {
        return pk;
    }

    public void setPk(EvaluacionIngresoPK pk) {
        this.pk = pk;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Frecuencia frecuencia) {
        this.frecuencia = frecuencia;
    }
}
