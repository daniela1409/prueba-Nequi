package org.example.pruebapracticabackendnequi.repository;

import org.example.pruebapracticabackendnequi.entity.BranchOffice;
import org.example.pruebapracticabackendnequi.entity.Franchise;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface BranchOfficeRepository extends ReactiveCrudRepository<BranchOffice, Long> {
    Flux<BranchOffice> findByFranchiseId(Long franchiseId);
}
