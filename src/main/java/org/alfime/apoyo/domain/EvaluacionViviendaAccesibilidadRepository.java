package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "viviendaAccesibilidades", path = "viviendaAccesibilidad")
public interface EvaluacionViviendaAccesibilidadRepository extends JpaRepository<EvaluacionViviendaAccesibilidad, Integer> {
    List<EvaluacionViviendaAccesibilidad> findByEvaluacionId(Integer evaluacionId);
}
