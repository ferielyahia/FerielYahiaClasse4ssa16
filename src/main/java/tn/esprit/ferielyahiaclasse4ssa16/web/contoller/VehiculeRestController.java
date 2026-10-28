package tn.esprit.ferielyahiaclasse4ssa16.web.contoller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ferielyahiaclasse4ssa16.Domain.Vehicule;
import tn.esprit.ferielyahiaclasse4ssa16.Service.IVehiculeServices;

@RestController
@RequiredArgsConstructor
@RequestMapping("vehicules")
public class VehiculeRestController {
    private final IVehiculeServices ivehiculeServices;
    @PostMapping("add")
    Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return ivehiculeServices.addVehicule(vehicule);
    }
    @GetMapping("get/{id}")
    Vehicule getVehicule(@PathVariable Long id) {
        return ivehiculeServices.getVehiculeById(id);
    }
}
