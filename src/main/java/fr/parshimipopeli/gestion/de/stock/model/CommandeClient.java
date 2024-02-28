package fr.parshimipopeli.gestion.de.stock.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
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

    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;

    @OneToMany(mappedBy = "commandeclient")
    private List<LigneCommandeClient> ligneCommandeClients;
}
