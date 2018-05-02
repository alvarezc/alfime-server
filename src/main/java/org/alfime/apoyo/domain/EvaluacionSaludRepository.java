package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "evaluacionesSalud", path = "evaluacionSalud")
public interface EvaluacionSaludRepository extends JpaRepository<EvaluacionSalud, Integer> {
    List<EvaluacionSalud> findByEvaluacionId(Integer evaluacionId);
}
