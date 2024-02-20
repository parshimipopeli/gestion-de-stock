package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="ligneCdeFournisseur")
public class LigneCommandeFournisseur extends AbstactEntity {
}
