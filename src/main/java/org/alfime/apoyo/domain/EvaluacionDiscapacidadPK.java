package org.alfime.apoyo.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EvaluacionDiscapacidadPK implements Serializable {
    @ManyToOne
    private Evaluacion evaluacion;

    @ManyToOne
    private Discapacidad discapacidad;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EvaluacionDiscapacidadPK)) return false;
        EvaluacionDiscapacidadPK that = (EvaluacionDiscapacidadPK) o;
        return Objects.equals(evaluacion, that.evaluacion) &&
                Objects.equals(discapacidad, that.discapacidad);
    }

    @Override
    public int hashCode() {

        return Objects.hash(evaluacion, discapacidad);
    }
}
