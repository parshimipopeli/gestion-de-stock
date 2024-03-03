package fr.parshimipopeli.gestion.de.stock.validator;

import fr.parshimipopeli.gestion.de.stock.dto.ClientDto;
import fr.parshimipopeli.gestion.de.stock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validate(ClientDto clientDto) {
        List<String> errors = new ArrayList<>();

        if (clientDto == null) {
            errors.add("Veullez renseigner le nom du client");
            errors.add("Veullez renseigner le prenom du client");
            errors.add("Veullez renseigner l'email' du client");
            errors.add("Veullez renseigner le numero de telephone du client");
            return errors;
        }

        if (!StringUtils.hasLength(clientDto.getNom())) {
            errors.add("Veullez renseigner le nom du client");
        }

        if (!StringUtils.hasLength(clientDto.getPrenom())) {
            errors.add("Veullez renseigner le prenom du client");
        }

        if (!StringUtils.hasLength(clientDto.getEmail())) {
            errors.add("Veullez renseigner l'email' du client");
        }

        if (!StringUtils.hasLength(clientDto.getTelephone())) {
            errors.add("Veullez renseigner le numero de telephone du client");
        }

        return errors;
    }
}