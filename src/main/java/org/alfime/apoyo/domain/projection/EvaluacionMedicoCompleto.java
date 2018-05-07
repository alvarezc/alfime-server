package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.CIE;
import org.alfime.apoyo.domain.EvaluacionMedico;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "completo", types = {EvaluacionMedico.class})
public interface EvaluacionMedicoCompleto {
    Integer getId();

    String getRecomendaciones();

    String getSinopsis();

    List<CIE> getDiagnostico();

    List<CIE> getFamiliar();
}
