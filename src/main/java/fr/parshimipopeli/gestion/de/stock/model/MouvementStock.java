package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="mouvementStock")
public class MouvementStock extends AbstactEntity {
}
