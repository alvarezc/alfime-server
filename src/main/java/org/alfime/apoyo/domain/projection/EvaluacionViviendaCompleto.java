package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.EvaluacionVivienda;
import org.alfime.apoyo.domain.ViviendaMaterial;
import org.alfime.apoyo.domain.ViviendaMobiliario;
import org.alfime.apoyo.domain.ViviendaTipo;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "completo", types = {EvaluacionVivienda.class})
public interface EvaluacionViviendaCompleto {
    Integer getId();

    ViviendaTipo getTipo();

    Byte getDormitorios();

    Byte getEstrato();

    ViviendaMaterial getPared();

    ViviendaMaterial getPiso();

    ViviendaMaterial getTecho();

    List<ViviendaMobiliario> getMobiliario();
}
