package fr.parshimipopeli.gestion.de.stock.validator;

import fr.parshimipopeli.gestion.de.stock.dto.ArticleDto;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public static List<String> validate(ArticleDto articledto) {
        List<String> errors = new ArrayList<>();

        if (articledto == null) {
            errors.add("Veuillez renseigner le code de l'article");
            errors.add("Veuillez renseigner la designation de l'article");
            errors.add("Veuillez renseigner le prix unitaire  HT l'article");
            errors.add("Veuillez renseigner le taux de tva l'article");
            errors.add("Veuillez renseigner le prix unitaire TTC l'article");
            errors.add("Veuillez selectionner une categorie");
            return errors;
        }

        if (!StringUtils.hasLength(articledto.getCodeArticle())) {
            errors.add("Veuillez renseigner le code de l'article");
        }

        if (!StringUtils.hasLength(articledto.getDesignation())) {
            errors.add("Veuillez renseigner la designation de l'article");
        }

        if (articledto.getPrixUnitaireHT() == null) {
            errors.add("Veuillez renseigner le prix unitaire  HT l'article");
        }

        if (articledto.getTauxTVA() == null) {
            errors.add("Veuillez renseigner le taux de tva l'article");
        }

        if (articledto.getPrixUnitaireTTC() == null) {
            errors.add("Veuillez renseigner le prix unitaire TTC l'article");
        }

        if (articledto.getCategorie() == null) {
            errors.add("Veuillez selectionner une categorie");
        }

        return errors;
    }
}
