package fr.parshimipopeli.gestion.de.stock.services;

import fr.parshimipopeli.gestion.de.stock.dto.ArticleDto;
import fr.parshimipopeli.gestion.de.stock.entity.Article;
import fr.parshimipopeli.gestion.de.stock.mapper.ArticleDtoMapper;
import fr.parshimipopeli.gestion.de.stock.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class ArticleService {

    private final ArticleDtoMapper articleDtoMapper;

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleDtoMapper articleDtoMapper, ArticleRepository articleRepository) {
        this.articleDtoMapper = articleDtoMapper;
        this.articleRepository = articleRepository;
    }

    public void create(Article article) {
        Article articleEnBDD = this.articleRepository.findByCodeArticle(article.getCodeArticle());
        if (articleEnBDD == null) {
            this.articleRepository.save(article);
        }
    };

    public Stream<ArticleDto> search() {
        return this.articleRepository.findAll()
                .stream().map(articleDtoMapper);
    }
}
