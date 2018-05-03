package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel="cifCategorias", path = "cifCategoria")
public interface CifCategoriaRepository extends JpaRepository<CifCategoria, Byte> {
}
