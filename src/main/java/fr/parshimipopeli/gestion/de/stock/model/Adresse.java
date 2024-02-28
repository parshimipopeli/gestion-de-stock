package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
@Data
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse implements Serializable {

    private String rue;

    private int numeroRue;

    private String ville;

    private String codePostal;

    private String pays;

}
