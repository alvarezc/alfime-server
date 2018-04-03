package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "ciudades")
public interface CiudadRepository extends JpaRepository<Ciudad, Short> {
    List<Ciudad> findCiudadByDepartamentoId(Byte id);
}
