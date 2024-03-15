package fr.parshimipopeli.gestion.de.stock.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="cdeClient")
public class CommandeClient extends AbstactEntity {


    private String codeCommande;

    private Date dateCommande;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusCommande statusCommande;

    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;

    @OneToMany(mappedBy = "commandeclient")
    private List<LigneCommandeClient> ligneCommandeClients;
}
