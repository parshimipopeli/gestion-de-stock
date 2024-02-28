package fr.parshimipopeli.gestion.de.stock.dto;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class UtilisateurDto {

    private String nom;

    private String prenom;

    private String email;

    private Date dateNaissance;

    private AdresseDto adresse;

    private String photo;

    private String motDePasse;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;
}
