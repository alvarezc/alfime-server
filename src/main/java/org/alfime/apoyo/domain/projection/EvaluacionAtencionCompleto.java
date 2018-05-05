package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.AtencionTipo;
import org.alfime.apoyo.domain.EvaluacionAtencion;
import org.alfime.apoyo.domain.Frecuencia;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "completo", types = {EvaluacionAtencion.class})
public interface EvaluacionAtencionCompleto {
    Integer getId();

    AtencionTipo getAtencionTipo();

    Byte getCantidad();

    Frecuencia getFrecuencia();
}
