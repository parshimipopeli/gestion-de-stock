package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.entity.Categorie;

import java.math.BigDecimal;


public class ArticleDto {

    private Long id;

    private String codeArticle;

    private String nom;

    private String designation;

    private BigDecimal prixUnitaireHT;

    private BigDecimal tauxTVA;

    private BigDecimal prixUnitaireTTC;

    private String photo;

    private CategorieDto categorie;

    public ArticleDto(String nom, String codeArticle, Categorie categorie, String designation, BigDecimal prixUnitaireTTC) {
    }
}
