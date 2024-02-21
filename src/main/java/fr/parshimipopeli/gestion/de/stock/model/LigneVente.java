package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="ligenVente")
public class LigneVente extends AbstactEntity {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idvente")
    private Vente vente;

    private Long quantite;
}
