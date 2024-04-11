package fr.parshimipopeli.gestion.de.stock.mapper;

import fr.parshimipopeli.gestion.de.stock.dto.EntrepriseDto;
import fr.parshimipopeli.gestion.de.stock.entity.Entreprise;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class EntrepriseDtoMapper implements Function<Entreprise, EntrepriseDto> {

    @Override
    public EntrepriseDto apply(@NotNull Entreprise entreprise) {
        return new EntrepriseDto(entreprise.getNom(), entreprise.getDescription(), entreprise.getPhoto(), entreprise.getEmail(), entreprise.getSiteWeb());
    }
}
