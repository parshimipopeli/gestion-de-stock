package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.LigneVente;
import fr.parshimipopeli.gestion.de.stock.model.MouvementStock;
import fr.parshimipopeli.gestion.de.stock.model.TypeMvmtStock;
import lombok.Builder;
import lombok.Data;
import java.util.Date;

@Data
@Builder
public class MouvementStockDto {

    private Long id;

    private Date dateMvmt;

    private Long quantite;

    private TypeMvmtStock typeMvmtStock;

    private ArticleDto article;

    private Integer idEntreprise;

    public static MouvementStockDto fromEntity(MouvementStock mouvementStock) {
        if (mouvementStock == null) {
            return null;
        }

        return MouvementStockDto.builder()
                .dateMvmt(mouvementStock.getDateMvmt())
                .article(ArticleDto.fromEntity(mouvementStock.getArticle()))
                .quantite(mouvementStock.getQuantite())
                .typeMvmtStock(mouvementStock.getTypeMvmtStock())
                .idEntreprise(mouvementStock.getIdEntreprise())
                .build();
    }

    public static MouvementStock toEntity(MouvementStockDto mouvementStockDto) {
        if (mouvementStockDto == null) {
            return null;
        }

        MouvementStock mouvementStock = new MouvementStock();
        mouvementStock.setDateMvmt(mouvementStockDto.getDateMvmt());
        mouvementStock.setArticle(ArticleDto.toEntity(mouvementStockDto.getArticle()));
        mouvementStock.setQuantite(mouvementStockDto.getQuantite());
        mouvementStock.setTypeMvmtStock(mouvementStockDto.getTypeMvmtStock());
        mouvementStock.setIdEntreprise(mouvementStockDto.getIdEntreprise());
        return mouvementStock;
    }
}
