package tn.esprit.ferielyahiaclasse4ssa16.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ferielyahiaclasse4ssa16.Domain.Vehicule;

public interface IVehiculeRapository extends JpaRepository<Vehicule,Long> {

}
