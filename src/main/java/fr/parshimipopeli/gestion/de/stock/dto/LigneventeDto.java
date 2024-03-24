package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.entity.Article;

public class LigneventeDto {

    private Long id;

    private VenteDto vente;

    private Article article;

    private Long quantite;

    private Float prixUnitaire;

    private Integer idEntreprise;

}
