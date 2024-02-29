package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.Article;
import fr.parshimipopeli.gestion.de.stock.model.Categorie;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
public class CategorieDto {

    private Long id;

    private String code;

    private String designation;

    private List<ArticleDto> articles;

    public static CategorieDto fromEntity(Categorie categorie) {
        if (categorie == null) {
            return null;
        }
        return CategorieDto.builder()
                .id(categorie.getId())
                .code(categorie.getCode())
                .designation(categorie.getDesignation())
                .build();
    }

    public Categorie toEntity(CategorieDto categorieDto) {
        if (categorieDto == null) {
            return null;
        }

        Categorie categorie = new Categorie();
        categorie.setId(categorieDto.getId());
        categorie.setCode(categorieDto.getCode());
        categorie.setDesignation(categorieDto.getDesignation());

        return categorie;
    }
}