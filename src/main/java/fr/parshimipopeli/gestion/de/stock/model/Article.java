package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="article")
public class Article extends AbstactEntity {

    @Column(name="cdeArticle")
    private String codeArticle;

    @Column(name="designation")
    private String designation;

    @Column(name="prixUnitaireHT")
    private BigDecimal prixUnitaireHT;

    @Column(name="tauxTVA")
    private BigDecimal tauxTVA;

    @Column(name="prixUnitaireTTC")
    private BigDecimal prixUnitaireTTC;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name="idcategorie")
    private Categorie categorie;
}
