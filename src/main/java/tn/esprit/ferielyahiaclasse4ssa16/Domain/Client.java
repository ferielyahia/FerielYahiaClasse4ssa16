
package tn.esprit.ferielyahiaclasse4ssa16.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "reservations")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClient;

    String nom;
    String prenom;
    String email;
    String telephone;
    String numPermis;

    LocalDate dateInscription;

    @OneToMany(mappedBy = "client")
    Set<Reservation> reservations;
}
