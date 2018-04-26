package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Projection(name = "completo", types = {Usuario.class})
public interface UsuarioCompleto {
    Integer getId();

    TipoDocumento getTipoDocumento();

    String getDocumento();

    String getNombre();

    String getSegundoNombre();

    String getApellidoPaterno();

    String getApellidoMaterno();

    Date getNacimiento();

    Genero getGenero();

    Set<Contacto> getContactos();
}
