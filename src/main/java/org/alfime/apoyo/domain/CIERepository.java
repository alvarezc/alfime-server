package org.alfime.apoyo.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "CIEs", path = "CIE")
public interface CIERepository extends JpaRepository<CIE, Integer> {
    Page<CIE> findByEnfermedadContains(String enfermedad, Pageable pageable);
}
