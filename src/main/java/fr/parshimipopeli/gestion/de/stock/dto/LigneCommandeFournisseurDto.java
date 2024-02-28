package fr.parshimipopeli.gestion.de.stock.dto;

import lombok.Data;
@Data
public class LigneCommandeFournisseurDto {

    private ArticleDto article;

    private CommandeFournisseurDto commandefournisseur;

    private Long quantite;

    private Float prixUnitaire;
}
