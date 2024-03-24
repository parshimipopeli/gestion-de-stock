package fr.parshimipopeli.gestion.de.stock.dto;


import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class UtilisateurDto {

    private Long id;

    private String nom;

    private String prenom;

    private String email;

    private Date dateNaissance;

    private AdresseDto adresse;

    private String photo;

    private String motDePasse;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;

//
}
