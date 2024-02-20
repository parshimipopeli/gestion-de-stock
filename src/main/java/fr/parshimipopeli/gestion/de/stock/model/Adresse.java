package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="adresse")
@Embeddable
public class Adresse {

    @Id
    private Long id;

    private String rue;

    private int numeroRue;

    private String ville;

    private String codePostal;

    private String pays;

}
