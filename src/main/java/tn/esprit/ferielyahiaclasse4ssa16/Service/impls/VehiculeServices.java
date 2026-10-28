package tn.esprit.ferielyahiaclasse4ssa16.Service.impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ferielyahiaclasse4ssa16.Domain.Vehicule;
import tn.esprit.ferielyahiaclasse4ssa16.Repository.IVehiculeRapository;
import tn.esprit.ferielyahiaclasse4ssa16.Service.IVehiculeServices;

import java.util.List;
@Service
@RequiredArgsConstructor
public class VehiculeServices implements IVehiculeServices {
    private final IVehiculeRapository ivehiculeRapository;

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return ivehiculeRapository.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return ivehiculeRapository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        ivehiculeRapository.deleteById(id);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return ivehiculeRapository.findById(id).orElseThrow(()-> new EntityNotFoundException("vehicule not found"));
    }

    @Override
    public List<Vehicule> findAll() {
        return ivehiculeRapository.findAll();
    }
}
