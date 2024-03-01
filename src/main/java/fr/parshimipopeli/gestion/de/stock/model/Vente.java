package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name="vente")
public class Vente extends AbstactEntity {

    private String code;

    @Column(name = "datevente")
    private Date dateVente;

    @Column(name = "commentaire")
    private String commentaire;

    @Column(name = "identreprise")
    private Integer idEntreprise;

}
