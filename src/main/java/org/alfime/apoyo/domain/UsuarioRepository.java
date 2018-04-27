package org.alfime.apoyo.domain;

import org.alfime.apoyo.domain.projection.UsuarioCompleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "usuarios", path = "usuario", excerptProjection = UsuarioCompleto.class)
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    @RestResource(path = "documentos", rel = "documentos")
    List<Usuario> findByDocumento(@Param("documento") String documento);
}
