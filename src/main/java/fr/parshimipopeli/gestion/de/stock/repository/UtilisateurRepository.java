package fr.parshimipopeli.gestion.de.stock.repository;

import fr.parshimipopeli.gestion.de.stock.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Long, Utilisateur> {
}
