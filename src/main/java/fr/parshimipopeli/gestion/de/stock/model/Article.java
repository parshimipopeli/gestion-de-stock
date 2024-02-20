package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name="article")
public class Article extends AbstactEntity {

    @Column(name="cdeArticle", nullable = false)
    private String codeArticle;

    @Column(name="nom", nullable = false)
    private String nom;

    @Column(name="designation", nullable = false)
    private String designation;

    @Column(name="prixUnitaireHT", nullable = false)
    private BigDecimal prixUnitaireHT;

    @Column(name="tauxTVA", nullable = false)
    private BigDecimal tauxTVA;

    @Column(name="prixUnitaireTTC", nullable = false)
    private BigDecimal prixUnitaireTTC;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name="idcategorie")
    private Categorie categorie;
}
