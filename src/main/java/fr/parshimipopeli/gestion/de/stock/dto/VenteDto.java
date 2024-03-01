package fr.parshimipopeli.gestion.de.stock.dto;


import fr.parshimipopeli.gestion.de.stock.model.Utilisateur;
import fr.parshimipopeli.gestion.de.stock.model.Vente;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.stream.Collectors;

@Data
@Builder
public class VenteDto {

    private Long id;
    private String code;
    private Date dateVente;
    private String commentaire;
    private Integer idEntreprise;

    public static VenteDto fromEntity(Vente vente) {
        if (vente == null) {
            return null;
        }

        return VenteDto.builder()
                .code(vente.getCode())
                .dateVente(vente.getDateVente())
                .commentaire(vente.getCommentaire())
                .idEntreprise(vente.getIdEntreprise())
                .build();
    }

    public static Vente toEntity(VenteDto venteDto) {
        if (venteDto == null) {
            return null;
        }

        Vente vente = new Vente();
        vente.setCode(venteDto.getCode());
        vente.setDateVente(venteDto.getDateVente());
        vente.setCommentaire(venteDto.getCommentaire());
        vente.setIdEntreprise(venteDto.getIdEntreprise());
        return vente;
    }
}
