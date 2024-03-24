package fr.parshimipopeli.gestion.de.stock.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="categorie")
public class Categorie extends AbstactEntity {

    @Column(name="codeCat")
    private String code;

    @Column(name="designation")
    private String designation;

    @OneToMany(mappedBy = "idCategorie")
    private List<Article> articles;


}
