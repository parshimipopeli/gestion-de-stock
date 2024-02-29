package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.Adresse;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseurDto {

    private Long id;

    private String nom;

    private String prenom;

    private Adresse adresse;

    private String photo;

    private String mail;

    private String telephone;

    private List<CommandeFournisseurDto> commandeFournisseurList;
}