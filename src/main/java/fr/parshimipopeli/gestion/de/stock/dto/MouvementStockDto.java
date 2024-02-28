package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.TypeMvmtStock;
import lombok.Data;
import java.util.Date;

@Data
public class MouvementStockDto {

    private Date dateMvmt;

    private Long quantite;

    private TypeMvmtStock typeMvmtStock;

    private ArticleDto article;
}
