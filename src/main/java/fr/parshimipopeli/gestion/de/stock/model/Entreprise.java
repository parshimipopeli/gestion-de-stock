package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="entreprise")
public class Entreprise extends AbstactEntity {

    @Id
    private Long id;

    @Column(name = "nom")
    private String nom;
}
