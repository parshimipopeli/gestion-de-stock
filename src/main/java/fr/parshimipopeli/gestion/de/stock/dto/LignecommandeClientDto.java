package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.Article;
import fr.parshimipopeli.gestion.de.stock.model.CommandeClient;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class LignecommandeClientDto {

    private ArticleDto article;

    private CommandeClientDto commandeclient;

    private Long quantite;

    private Float prixUnitaire;
}
