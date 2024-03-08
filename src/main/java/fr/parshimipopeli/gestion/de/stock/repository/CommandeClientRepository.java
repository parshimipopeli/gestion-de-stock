package fr.parshimipopeli.gestion.de.stock.repository;

import fr.parshimipopeli.gestion.de.stock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Long, CommandeClient> {
}
