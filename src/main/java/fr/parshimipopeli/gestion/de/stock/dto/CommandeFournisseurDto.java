package fr.parshimipopeli.gestion.de.stock.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CommandeFournisseurDto {

    private String code;

    private Date dateCommande;


    private FournisseurDto fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseur;
}
