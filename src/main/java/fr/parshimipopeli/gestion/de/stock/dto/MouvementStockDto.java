package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.entity.TypeMvmtStock;

import java.util.Date;


public class MouvementStockDto {

    private Long id;

    private Date dateMvmt;

    private Long quantite;

    private TypeMvmtStock typeMvmtStock;

    private ArticleDto article;

    private Integer idEntreprise;

}
