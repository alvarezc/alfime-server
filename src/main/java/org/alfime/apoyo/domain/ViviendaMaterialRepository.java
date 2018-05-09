package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "viviendaMateriales", path = "viviendaMaterial")
public interface ViviendaMaterialRepository extends JpaRepository<ViviendaMaterial, Byte> {
    List<ViviendaMaterial> findAllBySeccion(Byte seccionId);
}
