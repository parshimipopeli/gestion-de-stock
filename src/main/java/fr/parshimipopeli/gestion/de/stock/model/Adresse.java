package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
@Data
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse implements Serializable {

    @NotBlank(message = "Merci de renseigner le nom de la rue")
    private String rue;

    @NotBlank(message = "Merci de renseigner le numero de la rue")
    private int numeroRue;

    @NotBlank(message = "Merci de renseigner la ville")
    private String ville;

    @NotBlank(message = "Merci de renseigner le code postal")
    private String codePostal;

    @NotBlank(message = "Merci de renseigner le pays")
    @Length(min = 3, max = 10, message = "Le pays doit contenir entre trois et 10 caractéres!")
    private String pays;

}
