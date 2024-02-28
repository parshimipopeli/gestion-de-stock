package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.Adresse;
import fr.parshimipopeli.gestion.de.stock.model.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class EntrepriseDto {

    private String nom;

    private String description;

    private Adresse adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String telephone;

    private String siteWeb;

    private List<Utilisateur> utilisateurs;

}

