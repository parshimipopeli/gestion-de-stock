package fr.parshimipopeli.gestion.de.stock.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="client")
/**
 * Classe qui represente un objet client avec tous ces attributs
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

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;

}
