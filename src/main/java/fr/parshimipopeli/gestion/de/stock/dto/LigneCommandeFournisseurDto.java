package fr.parshimipopeli.gestion.de.stock.dto;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Long id;

    private ArticleDto article;

    private CommandeFournisseurDto commandefournisseur;

    private Long quantite;

    private Float prixUnitaire;
}
