package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.Article;
import lombok.Data;
import java.util.List;

@Data
public class CategorieDto {

    private String code;

    private String designation;

    private List<ArticleDto> articles;
}
