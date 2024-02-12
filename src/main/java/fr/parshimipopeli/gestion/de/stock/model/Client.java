package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="client")
public class Client extends AbstactEntity {

    private String nom;

    private String prenom;

    @Embedded
    private Adresse adresse;

    private String photo;

    private String email;

    private String telephone;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;

}
