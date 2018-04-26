package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.Usuario;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "dataTable", types = {Usuario.class})
public interface UsuarioDataTable {
    Integer getId();

    String getNombre();

    String getSegundoNombre();

    String getApellidoPaterno();

    String getApellidoMaterno();

    String getDocumento();
}
