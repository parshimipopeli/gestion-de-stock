package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="ligneCdeFournisseur")
public class LigneCommandeFournisseur extends AbstactEntity {

    @Column(name = "qte")
    private Long quantite;

    @Column(name = "pu")
    private Float prixUnitaire;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idcommandefournisseur")
    private CommandeFournisseur commandefournisseur;
}
