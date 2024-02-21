package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="mouvementStock")
public class MouvementStock extends AbstactEntity {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

}
