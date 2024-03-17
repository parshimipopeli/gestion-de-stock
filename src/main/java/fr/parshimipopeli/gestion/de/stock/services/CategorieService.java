package fr.parshimipopeli.gestion.de.stock.services;

import fr.parshimipopeli.gestion.de.stock.entity.Categorie;
import fr.parshimipopeli.gestion.de.stock.repository.CategorieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    private CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public void create(Categorie categorie) {
        Categorie categorieEnBDD = this.categorieRepository.findByCode(categorie.getCode());
        if (categorieEnBDD == null) {
            this.categorieRepository.save(categorie);
        }
    }

    public List<Categorie> search() {
        return this.categorieRepository.findAll();
    }
}
