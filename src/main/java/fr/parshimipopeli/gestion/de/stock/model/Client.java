package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="client")
/**
 * Classe qui represente un objet client avec tous ces atrtibuts
 */
public class Client extends AbstactEntity {

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Embedded
    @Column(name="adresse")
    private Adresse adresse;

    @Column(name="photo")
    private String photo;

    @Column(name="email")
    private String email;

    @Column(name="tel")
    private String telephone;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;

}
