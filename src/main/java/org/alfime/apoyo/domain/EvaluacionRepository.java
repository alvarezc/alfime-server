package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "evaluaciones", path = "evaluacion")
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Integer> {
    @RestResource
    List<Evaluacion> findByUsuarioId(@Param("id") Integer id);
}
