package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "evaluacionesIngresos", path = "evaluacionIngreso")
public interface EvaluacionIngresoRepository extends JpaRepository<EvaluacionIngreso, Integer> {
    List<EvaluacionIngreso> findByEvaluacionId(Integer evaluacionId);
}