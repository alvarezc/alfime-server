package org.alfime.apoyo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "cifCalificadores", path = "cifCalificador")
public interface CifCalificadorRepository extends JpaRepository<CifCalificador, Byte> {
    List<CifCalificador> findByFacilitadorIsFalse();
}
