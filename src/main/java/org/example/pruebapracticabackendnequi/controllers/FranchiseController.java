package org.example.pruebapracticabackendnequi.controllers;

import org.example.pruebapracticabackendnequi.entity.Franchise;
import org.example.pruebapracticabackendnequi.model.FranchiseDTO;
import org.example.pruebapracticabackendnequi.services.IFranchiseService;
import org.example.pruebapracticabackendnequi.services.imp.FranchiseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/franchise")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class FranchiseController {

    Logger logger = LoggerFactory.getLogger(FranchiseController.class);

    @Autowired
    private IFranchiseService franchiseService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Franchise> createFranchise(@RequestBody FranchiseDTO franchiseDTO) {
        System.out.println(franchiseDTO.getName());
        return franchiseService.saveFranchise(franchiseDTO)
                .doOnSuccess(fr -> logger.info("Franquicia creada: " + fr.getName()));

    }
}
