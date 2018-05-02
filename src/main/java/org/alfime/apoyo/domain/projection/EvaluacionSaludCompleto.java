package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "completo", types = {EvaluacionSalud.class})
public interface EvaluacionSaludCompleto {
    Integer getId();

    Regimen getRegimen();

    EPS getEps();

    Pension getFondoPension();

    CajaCompensacion getCajaCompensacion();
}
