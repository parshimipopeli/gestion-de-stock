package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.entity.Adresse;
import fr.parshimipopeli.gestion.de.stock.entity.Utilisateur;
import java.util.List;


public class EntrepriseDto {

    private Long id;

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

