package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name="mouvementStock")
public class MouvementStock extends AbstactEntity {

    @Column(name = "date")
    private Date dateMvmt;

    @Column(name = "qte")
    private Long quantite;

    @Column(name = "typemvmt")
    private TypeMvmtStock typeMvmtStock;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

}
