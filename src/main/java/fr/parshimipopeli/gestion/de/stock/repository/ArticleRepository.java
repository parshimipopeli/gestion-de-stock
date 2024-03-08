package fr.parshimipopeli.gestion.de.stock.repository;

import fr.parshimipopeli.gestion.de.stock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository  extends JpaRepository<Long, Article> {

    @Query("select a from article where codearticle = :code")
    List<Article> findByCustomQuery(String code);
    Article findBycodeArticle(String codeArticle);


}
