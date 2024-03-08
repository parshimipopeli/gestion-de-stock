package fr.parshimipopeli.gestion.de.stock.repository;

import fr.parshimipopeli.gestion.de.stock.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Long, Categorie> {
}
