package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.Categorie;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ArticleDto {

    private String codeArticle;

    private String nom;

    private String designation;

    private BigDecimal prixUnitaireHT;

    private BigDecimal tauxTVA;

    private BigDecimal prixUnitaireTTC;

    private String photo;

    private CategorieDto categorie;
}
