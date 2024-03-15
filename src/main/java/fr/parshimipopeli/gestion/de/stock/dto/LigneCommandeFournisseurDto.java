package fr.parshimipopeli.gestion.de.stock.dto;


public class LigneCommandeFournisseurDto {

    private Long id;

    private ArticleDto article;

    private CommandeFournisseurDto commandefournisseur;

    private Long quantite;

    private Float prixUnitaire;

    private Integer idEntreprise;
}
