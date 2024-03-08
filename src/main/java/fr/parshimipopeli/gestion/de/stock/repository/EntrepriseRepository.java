package fr.parshimipopeli.gestion.de.stock.repository;

import fr.parshimipopeli.gestion.de.stock.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Long, Entreprise> {
}
