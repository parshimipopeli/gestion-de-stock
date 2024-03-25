package fr.parshimipopeli.gestion.de.stock.services;

import fr.parshimipopeli.gestion.de.stock.dto.ArticleDto;
import fr.parshimipopeli.gestion.de.stock.entity.Article;
import fr.parshimipopeli.gestion.de.stock.mapper.ArticleDtoMapper;
import fr.parshimipopeli.gestion.de.stock.repository.ArticleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
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

    public Article searchOne(Long id) {
        Optional<Article> optionalArticle = this.articleRepository.findById(id);
            return optionalArticle.orElseThrow(
                    () -> new EntityNotFoundException("Aucun article trouvé avec cet identifiant!")
            );

    }

    public void updateArticle(Long id, Article article) {
        Article articleEnBDD = this.searchOne(id);
        if (articleEnBDD.getId() == article.getId()) {
            articleEnBDD.setCodeArticle(article.getCodeArticle());
            articleEnBDD.setNom(article.getNom());
            articleEnBDD.setDesignation(article.getDesignation());
            articleEnBDD.setPrixUnitaireHT(article.getPrixUnitaireHT());
            articleEnBDD.setTauxTVA(article.getTauxTVA());
            articleEnBDD.setPrixUnitaireTTC(article.getPrixUnitaireTTC());
            articleEnBDD.setPhoto(article.getPhoto());
            articleEnBDD.setIdCategorie(article.getIdCategorie());
            this.articleRepository.save(articleEnBDD);
        }
        this.articleRepository.save(articleEnBDD);
    }

    public void deleteOne(Long id) {
        this.articleRepository.deleteById(id);
    }

//    public Article findByCodeArticle(String codeArticle) {
//        Article articleEnBDD = this.articleRepository.findByCodeArticle(codeArticle);
//        if (articleEnBDD.getCodeArticle() != null) {
//            return articleEnBDD;
//        }
//        return null;
//    }


}
