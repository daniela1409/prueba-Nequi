package org.example.pruebapracticabackendnequi.controllers;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class NequiController {

    @GetMapping("/getAll")
    public Flux<String> getAllNequi() {
        return Flux.just("Nequi 1", "Nequi 2", "Nequi 3");
    }
}
