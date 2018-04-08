package org.alfime.apoyo.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EvaluacionIngresoPK implements Serializable {
    @ManyToOne
    private Evaluacion evaluacion;

    @ManyToOne
    private Ingreso ingreso;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EvaluacionIngresoPK)) return false;
        EvaluacionIngresoPK that = (EvaluacionIngresoPK) o;
        return Objects.equals(evaluacion, that.evaluacion) &&
                Objects.equals(ingreso, that.ingreso);
    }

    @Override
    public int hashCode() {

        return Objects.hash(evaluacion, ingreso);
    }
}
