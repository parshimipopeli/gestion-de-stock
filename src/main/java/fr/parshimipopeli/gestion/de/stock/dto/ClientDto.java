package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.entity.Adresse;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ClientDto {
    private String nom;

    private String prenom;

    private Adresse adresse;

    private String email;

    private String telephone;

    public ClientDto(String nom, String prenom, String email, Adresse adresse, String telephone) {
    }
}
