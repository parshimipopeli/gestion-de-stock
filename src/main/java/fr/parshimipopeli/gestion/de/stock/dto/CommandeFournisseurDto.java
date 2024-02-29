package fr.parshimipopeli.gestion.de.stock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {

    private Long id;

    private String code;

    private Date dateCommande;

    private FournisseurDto fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseur;


}
