package fr.parshimipopeli.gestion.de.stock.services;

import fr.parshimipopeli.gestion.de.stock.dto.EntrepriseDto;
import fr.parshimipopeli.gestion.de.stock.entity.Entreprise;
import fr.parshimipopeli.gestion.de.stock.mapper.EntrepriseDtoMapper;
import fr.parshimipopeli.gestion.de.stock.repository.EntrepriseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class EntrepriseService {
    private final EntrepriseDtoMapper entrepriseDtoMapper;
    private final EntrepriseRepository entrepriseRepository;

    public EntrepriseService(EntrepriseDtoMapper entrepriseDtoMapper, EntrepriseRepository entrepriseRepository) {
        this.entrepriseDtoMapper = entrepriseDtoMapper;
        this.entrepriseRepository = entrepriseRepository;
    }

    public void create(Entreprise entreprise) {
        Entreprise entrepriseEnBDD = this.entrepriseRepository.findByNom(entreprise.getNom());
        if (entrepriseEnBDD == null) {
            this.entrepriseRepository.save(entreprise);
        }
    }

    public Stream<EntrepriseDto> search() {
        return this.entrepriseRepository.findAll()
                .stream().map(entrepriseDtoMapper);
    }


    public Entreprise searchOne(Long id) {
        Optional<Entreprise> optionalEntreprise = this.entrepriseRepository.findById(id);
        return optionalEntreprise.orElseThrow(
                () -> new EntityNotFoundException("Aucune entreprise trouvée avec cet id!")
        );
    }
}
