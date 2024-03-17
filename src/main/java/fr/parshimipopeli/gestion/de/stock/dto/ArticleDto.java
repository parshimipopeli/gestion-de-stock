package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.entity.Categorie;
import lombok.Data;

import java.math.BigDecimal;


public record ArticleDto (
        String codeArticle,
        String nom,
        String designation,
        BigDecimal prixUnitaireTTC
) {}




