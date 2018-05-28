package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.SeccionData;
import org.alfime.apoyo.domain.SeccionTipo;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "tipo", types = {SeccionData.class})
public interface SeccionDataTipo {
    Long getId();

    String getContenido();

    SeccionTipo getTipo();
}
