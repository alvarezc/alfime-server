package org.alfime.apoyo.domain.projection;

import org.alfime.apoyo.domain.CifCategoria;
import org.alfime.apoyo.domain.CifItem;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "completo", types = {CifCategoria.class})
public interface CifCategoriaCompleto {
    Byte getId();

    String getNombre();

    List<CifItem> getItems();
}
