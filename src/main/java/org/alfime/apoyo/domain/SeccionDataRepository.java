package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "seccionDatas", path = "seccionData")
public interface SeccionDataRepository extends JpaRepository<SeccionData, Long> {
    List<SeccionData> findAllByUsuarioIdAndSeccionId(Integer usuarioId, Byte seccionId);
}
