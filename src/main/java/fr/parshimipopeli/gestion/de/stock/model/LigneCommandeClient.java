package fr.parshimipopeli.gestion.de.stock.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="ligneCdeclient")
public class LigneCommandeClient extends AbstactEntity {

    @Column(name = "qte")
    private Long quantite;

    @Column(name = "pu")
    private Float prixUnitaire;

    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;


    @ManyToOne
    @JoinColumn(name="idcommandeclient")
    private  CommandeClient commandeclient;

}
