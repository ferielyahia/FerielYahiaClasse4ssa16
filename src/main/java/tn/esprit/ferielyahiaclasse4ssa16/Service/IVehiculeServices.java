package tn.esprit.ferielyahiaclasse4ssa16.Service;

import tn.esprit.ferielyahiaclasse4ssa16.Domain.Vehicule;

import java.util.List;

public interface IVehiculeServices {
    Vehicule addVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id );
    Vehicule getVehiculeById(Long id);
    List<Vehicule> findAll();
}
