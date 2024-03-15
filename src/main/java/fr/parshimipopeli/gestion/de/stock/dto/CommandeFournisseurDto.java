package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.entity.CommandeFournisseur;
import fr.parshimipopeli.gestion.de.stock.entity.StatusCommande;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;


public class CommandeFournisseurDto {

    private Long id;

    private String code;

    private Date dateCommande;

    private StatusCommande statusCommande;

    private FournisseurDto fournisseur;

    private Integer idEntreprise;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseur;

}
