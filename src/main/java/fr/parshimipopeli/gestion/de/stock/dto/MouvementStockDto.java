package fr.parshimipopeli.gestion.de.stock.dto;

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
}
