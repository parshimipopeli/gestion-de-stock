package fr.parshimipopeli.gestion.de.stock.dto;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class RoleDto {

    private Long id;

    private String nom;

    private UtilisateurDto utilisateur;
}
