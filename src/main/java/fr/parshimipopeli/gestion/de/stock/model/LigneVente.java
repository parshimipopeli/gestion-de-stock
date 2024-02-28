package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="ligenVente")
public class LigneVente extends AbstactEntity {

    @ManyToOne
    @JoinColumn(name = "idvente")
    private Vente vente;

    @Column(name = "qte")
    private Long quantite;

    @Column(name = "pu")
    private Float prixUnitaire;
}
