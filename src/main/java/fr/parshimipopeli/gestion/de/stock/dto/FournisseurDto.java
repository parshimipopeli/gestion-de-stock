package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.Adresse;
import lombok.Data;

import java.util.List;

@Data
public class FournisseurDto {

    private String nom;

    private String prenom;

    private Adresse adresse;

    private String photo;

    private String mail;

    private String telephone;

    private List<CommandeFournisseurDto> commandeFournisseurList;
}
