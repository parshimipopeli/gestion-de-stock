package fr.parshimipopeli.gestion.de.stock.repository;

import fr.parshimipopeli.gestion.de.stock.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Long, Fournisseur> {
}
