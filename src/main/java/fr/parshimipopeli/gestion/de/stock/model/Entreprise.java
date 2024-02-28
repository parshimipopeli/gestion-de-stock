package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="entreprise")
public class Entreprise extends AbstactEntity {

    @Column(name = "nom")
    private String nom;

    @Column(name = "desc")
     private String description;

    @Embedded
    private Adresse adresse;

    @Column(name = "cdeFiscal")
    private String codeFiscal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;

    @Column(name = "tel")
    private String telephone;

    @Column(name = "siteWeb")
    private String siteWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;

}
