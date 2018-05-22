package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "lista", types = {SeccionData.class})
public interface SeccionDataList {
    Byte getId();

    String getCreatedBy();

    Long getCreatedDate();

    Long getModifiedDate();

    SeccionTipo getTipo();
}
