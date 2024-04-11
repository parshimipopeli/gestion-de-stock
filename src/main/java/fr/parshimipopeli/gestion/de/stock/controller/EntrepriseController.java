package fr.parshimipopeli.gestion.de.stock.controller;

import fr.parshimipopeli.gestion.de.stock.dto.EntrepriseDto;
import fr.parshimipopeli.gestion.de.stock.entity.Entreprise;
import fr.parshimipopeli.gestion.de.stock.services.EntrepriseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping(path = "entreprise")
public class EntrepriseController {
    private EntrepriseService entrepriseService;

    public EntrepriseController(EntrepriseService entrepriseService) {
        this.entrepriseService = entrepriseService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping
    private void create(@RequestBody Entreprise entreprise) {
        this.entrepriseService.create(entreprise);
    }

    @GetMapping
    public Stream<EntrepriseDto> search() {
        return this.entrepriseService.search();
    }






}
