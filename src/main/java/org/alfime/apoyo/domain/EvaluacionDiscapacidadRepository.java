package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "evaluacionesDiscapacidades", path = "evaluacionDiscapacidad")
public interface EvaluacionDiscapacidadRepository extends JpaRepository<EvaluacionDiscapacidad, Integer> {
    List<EvaluacionDiscapacidad> findByEvaluacionId(Integer evaluacionId);
}
