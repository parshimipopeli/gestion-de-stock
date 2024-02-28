package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="cdeFournisseur")
public class CommandeFournisseur extends AbstactEntity {

   @Column(name = "code")
   private String code;

   @Column(name = "dateCommande")
   private Date dateCommande;

   @ManyToOne
   @JoinColumn(name = "idfournisseur")
   private Fournisseur fournisseur;

   @OneToMany(mappedBy = "commandefournisseur")
   private List<LigneCommandeFournisseur> ligneCommandeFournisseur;


}
