package fr.parshimipopeli.gestion.de.stock.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="ligneCdeclient")
public class LigneCommandeClient extends AbstactEntity {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;


    @ManyToOne
    @JoinColumn(name="idcommandeclient")
    private  CommandeClient commandeClient;

}
