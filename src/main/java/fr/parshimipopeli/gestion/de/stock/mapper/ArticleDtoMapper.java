package fr.parshimipopeli.gestion.de.stock.mapper;

import fr.parshimipopeli.gestion.de.stock.dto.ArticleDto;
import fr.parshimipopeli.gestion.de.stock.entity.Article;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ArticleDtoMapper implements Function<Article, ArticleDto> {
    @Override
    public ArticleDto apply(@NotNull Article article) {
        return new ArticleDto(article.getCodeArticle(), article.getNom(), article.getDesignation(), article.getPrixUnitaireTTC());
    }

}
