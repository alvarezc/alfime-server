package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.Evaluacion;
import org.alfime.apoyo.domain.Programa;
import org.alfime.apoyo.domain.Remitente;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "evaluacion", types = {Evaluacion.class})
public interface EvaluacionCompleto {
    public Integer getId();

    public Date getFecha();

    public boolean getAceptado();

    public String getObservaciones();

    public String getConclusiones();

    public List<Programa> getPlan();

    public List<Programa> getAspiracion();

    public Remitente getRemitente();
}
