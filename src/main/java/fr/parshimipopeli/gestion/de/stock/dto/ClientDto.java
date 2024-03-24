package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.entity.Adresse;
import lombok.Data;
import lombok.NoArgsConstructor;


public record ClientDto(
        String nom,

        String prenom,

        Adresse adresse,

        String email,

        String telephone
) {}
