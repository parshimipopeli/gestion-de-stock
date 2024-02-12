package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="adresse")
@Embeddable
public class Adresse {


    private String rue;

    private int numeroRue;

    private String ville;

    private String codePostal;

    private String pays;

}
