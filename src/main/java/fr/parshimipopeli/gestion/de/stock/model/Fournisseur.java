package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="fournisseur")
public class Fournisseur {
}
