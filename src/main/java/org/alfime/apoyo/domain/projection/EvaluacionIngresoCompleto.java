package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.EvaluacionIngreso;
import org.alfime.apoyo.domain.Frecuencia;
import org.alfime.apoyo.domain.Ingreso;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "completo", types = {EvaluacionIngreso.class})
public interface EvaluacionIngresoCompleto {
    Integer getId();

    Ingreso getIngreso();

    Long getMonto();

    Frecuencia getFrecuencia();
}
