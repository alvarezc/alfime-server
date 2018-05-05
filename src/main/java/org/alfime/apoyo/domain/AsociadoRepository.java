package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "asociados", path = "asociado")
public interface AsociadoRepository extends JpaRepository<Asociado, Short> {
    Asociado findByUsuario(String usuario);
}
