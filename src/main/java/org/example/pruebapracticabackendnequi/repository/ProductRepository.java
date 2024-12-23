package org.example.pruebapracticabackendnequi.repository;

import org.example.pruebapracticabackendnequi.entity.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {
    Flux<Product> findByBranchOfficeId(Long branchOfficeId);
}
