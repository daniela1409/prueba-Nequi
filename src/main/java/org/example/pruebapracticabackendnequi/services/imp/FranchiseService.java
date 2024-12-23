package org.example.pruebapracticabackendnequi.services.imp;

import org.example.pruebapracticabackendnequi.entity.Franchise;
import org.example.pruebapracticabackendnequi.model.FranchiseDTO;
import org.example.pruebapracticabackendnequi.repository.FranchiseRepository;
import org.example.pruebapracticabackendnequi.services.IFranchiseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.UUID;

@Service
public class FranchiseService implements IFranchiseService {

    @Autowired
    private FranchiseRepository franchiseRepository;

    @Override
    public Mono<Franchise> saveFranchise(FranchiseDTO franchise) {
        Franchise franchiseEntity = new Franchise(UUID.randomUUID(), franchise.getName());
        return franchiseRepository.save(franchiseEntity);
    }
}
