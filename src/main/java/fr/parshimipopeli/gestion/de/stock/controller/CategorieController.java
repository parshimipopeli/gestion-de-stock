package fr.parshimipopeli.gestion.de.stock.controller;

import fr.parshimipopeli.gestion.de.stock.entity.Categorie;
import fr.parshimipopeli.gestion.de.stock.services.CategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("categorie")
public class CategorieController {
    // Déclaration de la dépendence en privé
    private final CategorieService categorieService;

    // Injection du CategorieService par le constructeur
    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }


    @ResponseStatus(CREATED)
    @PostMapping
    public void create(@RequestBody Categorie categorie) {
        this.categorieService.create(categorie);
    }

    @GetMapping
    public List<Categorie> search() {
        return this.categorieService.search();
    }

}
