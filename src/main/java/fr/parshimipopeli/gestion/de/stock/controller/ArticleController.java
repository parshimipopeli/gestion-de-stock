package fr.parshimipopeli.gestion.de.stock.controller;


import fr.parshimipopeli.gestion.de.stock.dto.ArticleDto;
import fr.parshimipopeli.gestion.de.stock.entity.Article;
import fr.parshimipopeli.gestion.de.stock.services.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.stream.Stream;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping(path = "article")
public class ArticleController {

    // Déclaration de la dépendance articleService
    private ArticleService articleService;

    // Injection de la dépendance via le constructeur
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping
    private void create(@RequestBody Article article) {
         this.articleService.create(article);
    }

    @GetMapping
    public Stream<ArticleDto> search() {
        return this.articleService.search();
    }

    @GetMapping(path = "{id}")
    public Article searchOne(@PathVariable Long id) {
        return this.articleService.searchOne(id);
    }

    @ResponseStatus(NO_CONTENT)
    @PutMapping(path = "{id}")
    public void updateArticle(@PathVariable Long id, @RequestBody Article article ) {
        this.articleService.updateArticle(id, article);
    }

    @ResponseStatus(NO_CONTENT)
    @DeleteMapping(path = "{id}")
    public void deleteOne(@PathVariable Long id) {
        this.articleService.deleteOne(id);
    }

//    @GetMapping(path = "{codeArticle}")
//    public Article findByCodeArticle(@PathVariable String codeArticle) {
//        return this.articleService.findByCodeArticle(codeArticle);
//    }
}
