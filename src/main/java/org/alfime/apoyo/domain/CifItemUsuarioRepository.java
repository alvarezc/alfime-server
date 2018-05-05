package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "cifItemUsuarios", path = "cifItemUsuario")
public interface CifItemUsuarioRepository extends JpaRepository<CifItemUsuario, Long> {
    List<CifItemUsuario> findAllByUsuarioIdAndItemCategoriaComponenteId(Integer usuarioId, Byte componenteId);
}
