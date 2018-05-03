package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "actividadesEconomicas", path = "actividadEconomica")
public interface ActividadEconomicaRepository extends JpaRepository<ActividadEconomica, Integer> {
}
