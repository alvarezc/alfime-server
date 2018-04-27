package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.Evaluacion;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "id", types = {Evaluacion.class})
public interface EvaluacionId {
    public Integer getId();
}
