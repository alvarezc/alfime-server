package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "evaluacionesAtenciones", path = "evaluacionAtencion")
public interface EvaluacionAtencionRepository extends JpaRepository<EvaluacionAtencion, Integer> {
    List<EvaluacionAtencion> findByEvaluacionId(Integer evaluacionId);
}
