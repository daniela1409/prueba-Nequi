package org.example.pruebapracticabackendnequi.services;

import org.example.pruebapracticabackendnequi.entity.Franchise;
import org.example.pruebapracticabackendnequi.model.FranchiseDTO;
import reactor.core.publisher.Mono;

public interface IFranchiseService {

    public Mono<Franchise> saveFranchise(FranchiseDTO franchise);
}
