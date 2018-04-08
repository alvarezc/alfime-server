package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "cajasCompensacion", path = "caja-compensacion")
public interface CajaCompensacionRepository extends JpaRepository<CajaCompensacion, Short> {
}
