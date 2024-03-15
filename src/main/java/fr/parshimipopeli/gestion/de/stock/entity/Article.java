package fr.parshimipopeli.gestion.de.stock.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="article")
public class Article extends AbstactEntity {

    @Column(name="cdeArticle")
    private String codeArticle;

    @Column(name="nom")
    private String nom;

    @Column(name="designation")
    private String designation;

    @Column(name="prix-unitaire-HT")
    private BigDecimal prixUnitaireHT;

    @Column(name="taux-TVA")
    private BigDecimal tauxTVA;

    @Column(name="prix-unitaire-TTC")
    private BigDecimal prixUnitaireTTC;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name="idcategorie")
    private Categorie categorie;

}
