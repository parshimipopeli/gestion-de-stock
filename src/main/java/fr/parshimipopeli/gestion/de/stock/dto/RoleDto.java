package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.LigneVente;
import fr.parshimipopeli.gestion.de.stock.model.Role;
import fr.parshimipopeli.gestion.de.stock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class RoleDto {

    private Long id;

    private String nom;

    private UtilisateurDto utilisateur;

    public static RoleDto fromEntity(Role role) {
        if (role == null) {
            return null;
        }

        return RoleDto.builder()
                .nom(role.getNom())
                .build();
    }

    public static Role toEntity(RoleDto roleDto) {
        if (roleDto == null) {
            return null;
        }

        Role role = new Role();
        role.setNom(roleDto.getNom());
        role.setUtilisateur(UtilisateurDto.toEntity(roleDto.getUtilisateur()));
        return role;
    }
}
