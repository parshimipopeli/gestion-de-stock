package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.Article;
import fr.parshimipopeli.gestion.de.stock.model.LigneCommandeFournisseur;
import fr.parshimipopeli.gestion.de.stock.model.LigneVente;
import fr.parshimipopeli.gestion.de.stock.model.Vente;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneventeDto {

    private Long id;

    private VenteDto vente;

    private Article article;

    private Long quantite;

    private Float prixUnitaire;

    private Integer idEntreprise;

    public static LigneventeDto fromEntity(LigneVente ligneVente) {
        if (ligneVente == null) {
            return null;
        }

        return LigneventeDto.builder()
                .vente(VenteDto.fromEntity(ligneVente.getVente()))
//                .article(ArticleDto.fromEntity(ligneVente.getArticle()))
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .idEntreprise(ligneVente.getIdEntreprise())
                .build();
    }

    public static LigneVente toEntity(LigneventeDto ligneventeDto) {
        if (ligneventeDto == null) {
            return null;
        }

        LigneVente ligneVente = new LigneVente();
        ligneVente.setVente(VenteDto.toEntity(ligneventeDto.getVente()));
//        ligneVente.setArticle(ArticleDto.toEntity(ligneventeDto.getArticle()));
        ligneVente.setQuantite(ligneventeDto.getQuantite());
        ligneVente.setPrixUnitaire(ligneventeDto.getPrixUnitaire());
        ligneVente.setIdEntreprise(ligneventeDto.getIdEntreprise());
        return ligneVente;
    }
}
