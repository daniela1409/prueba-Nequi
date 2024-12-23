package org.example.pruebapracticabackendnequi.repository;

import org.example.pruebapracticabackendnequi.entity.Franchise;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranchiseRepository extends ReactiveCrudRepository<Franchise, Long> {
}
