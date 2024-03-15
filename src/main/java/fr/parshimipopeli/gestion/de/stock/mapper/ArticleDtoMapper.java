package fr.parshimipopeli.gestion.de.stock.mapper;

import fr.parshimipopeli.gestion.de.stock.dto.ArticleDto;
import fr.parshimipopeli.gestion.de.stock.entity.Article;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ArticleDtoMapper implements Function<Article, ArticleDto> {
    @Override
    public ArticleDto apply(@NonNull Article article) {
        return new ArticleDto(article.getNom(), article.getCodeArticle(), article.getCategorie(), article.getDesignation(), article.getPrixUnitaireTTC());
    }

}
