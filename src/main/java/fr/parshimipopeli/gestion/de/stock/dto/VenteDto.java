package fr.parshimipopeli.gestion.de.stock.dto;


import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class VenteDto {

    private Long id;
    private String code;
    private Date dateVente;
    private String commentaire;
}
