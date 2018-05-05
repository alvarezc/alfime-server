package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "completo", types = {EvaluacionDiscapacidad.class})
public interface EvaluacionDiscapacidadCompleto {
    Integer getId();

    Discapacidad getDiscapacidad();

    Boolean getCongenita();

    Date getAdquisicion();
}
