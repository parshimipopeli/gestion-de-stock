package fr.parshimipopeli.gestion.de.stock.entity;

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

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @Column(name = "qte")
    private Long quantite;

    @Column(name = "pu")
    private Float prixUnitaire;

    @Column(name = "identreprise")
    private Integer idEntreprise;
}
