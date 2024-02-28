package fr.parshimipopeli.gestion.de.stock.model;

import fr.parshimipopeli.gestion.de.stock.dto.AdresseDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="utilisateur")
public class Utilisateur extends AbstactEntity {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "datenaissance")
    private Date dateNaissance;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "mdp")
    private String motDePasse;

    @ManyToOne
    @JoinColumn(name = "identreprise")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Role> roles;


}
