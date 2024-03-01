package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.Article;
import fr.parshimipopeli.gestion.de.stock.model.CommandeClient;
import fr.parshimipopeli.gestion.de.stock.model.Fournisseur;
import fr.parshimipopeli.gestion.de.stock.model.LigneCommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LignecommandeClientDto {

    private Long id;

    private ArticleDto article;

    private CommandeClientDto commandeclient;

    private Long quantite;

    private Float prixUnitaire;

    private Integer idEntreprise;

    public static LignecommandeClientDto fromEntity(LigneCommandeClient lignecommandeClient) {
        if (lignecommandeClient == null) {
            return null;
        }

        return LignecommandeClientDto.builder()
                .article(ArticleDto.fromEntity(lignecommandeClient.getArticle()))
                .quantite(lignecommandeClient.getQuantite())
                .prixUnitaire(lignecommandeClient.getPrixUnitaire())
                .idEntreprise(lignecommandeClient.getIdEntreprise())
                .build();
    }

    public static LigneCommandeClient toEntity(LignecommandeClientDto lignecommandeClientDto) {
        if (lignecommandeClientDto == null) {
            return null;
        }

        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setArticle(ArticleDto.toEntity(lignecommandeClientDto.getArticle()));
        ligneCommandeClient.setQuantite(lignecommandeClientDto.getQuantite());
        ligneCommandeClient.setPrixUnitaire(lignecommandeClientDto.getPrixUnitaire());
        ligneCommandeClient.setIdEntreprise(lignecommandeClientDto.getIdEntreprise());
        return ligneCommandeClient;
    }
}
