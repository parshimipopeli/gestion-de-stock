package fr.parshimipopeli.gestion.de.stock.validator;

import fr.parshimipopeli.gestion.de.stock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto utilisateurDto) {
        List<String> errors = new ArrayList<>();

        if (utilisateurDto == null) {
            errors.add("Veuillez renseigner le nom de l'utilisateur");
            errors.add("Veuillez renseigner le prenom de l'utilisateur");
            errors.add("Veuillez renseigner l'email' l'utilisateur");
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
            errors.add("Veuillez renseigner la date de naissance de l'utilisateur");
            errors.add("Veuillez renseigner l'adresse de l'utilisateur");
        }

        if (!StringUtils.hasLength(utilisateurDto.getNom())) {
            errors.add("Veuillez renseigner le nom de l'utilisateur");
            }

        if (!StringUtils.hasLength(utilisateurDto.getPrenom())) {
            errors.add("Veuillez renseigner le prenom de l'utilisateur");
            }

        if (!StringUtils.hasLength(utilisateurDto.getEmail())) {
        errors.add("Veuillez renseigner l'email' l'utilisateur");
            }

        if (!StringUtils.hasLength(utilisateurDto.getMotDePasse())) {
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
        }

        if (utilisateurDto.getDateNaissance() == null) {
            errors.add("Veuillez renseigner la date de naissance de l'utilisateur");
            }

        if (utilisateurDto.getAdresse() == null) {
            errors.add("Veuillez renseigner l'adresse de l'utilisateur");
            } else {
                if (!StringUtils.hasLength(String.valueOf(utilisateurDto.getAdresse().getNumeroRue()))) {
                errors.add("Veuillez renseigner le numero de rue de l'utilisateur");
                }

                if (!StringUtils.hasLength(String.valueOf(utilisateurDto.getAdresse().getRue()))) {
                errors.add("Veuillez renseigner la rue de l'utilisateur");
                }

                if (!StringUtils.hasLength(String.valueOf(utilisateurDto.getAdresse().getVille()))) {
                errors.add("Veuillez renseigner la ville de l'utilisateur");
                }

                if (!StringUtils.hasLength(String.valueOf(utilisateurDto.getAdresse().getCodePostal()))) {
                errors.add("Veuillez renseigner le code postal de l'utilisateur");
                }

                if (!StringUtils.hasLength(String.valueOf(utilisateurDto.getAdresse().getPays()))) {
                errors.add("Veuillez renseigner le pays de l'utilisateur");
                }

            }
        return errors;
    }
}
