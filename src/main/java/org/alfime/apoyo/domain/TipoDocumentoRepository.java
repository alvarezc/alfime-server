package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "tiposDocumento", path = "tipoDocumento")
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Byte> {
}
