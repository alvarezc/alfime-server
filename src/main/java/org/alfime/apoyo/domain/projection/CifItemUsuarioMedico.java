package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.CifCalificador;
import org.alfime.apoyo.domain.CifCategoria;
import org.alfime.apoyo.domain.CifItem;
import org.alfime.apoyo.domain.CifItemUsuario;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "medico", types = {CifItemUsuario.class})
public interface CifItemUsuarioMedico {
    Byte getId();

    CifItem getItem();

    default CifCategoria getCategoria() {
        return getItem().getCategoria();
    }

    CifCalificador getCalificador();
}
