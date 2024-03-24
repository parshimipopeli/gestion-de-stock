package fr.parshimipopeli.gestion.de.stock.entity;

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

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

}
