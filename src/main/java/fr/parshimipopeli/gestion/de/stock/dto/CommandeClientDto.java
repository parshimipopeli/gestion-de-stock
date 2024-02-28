package fr.parshimipopeli.gestion.de.stock.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CommandeClientDto {

    private String codeCommande;

    private Date dateCommande;

    private ClientDto client;

    private List<LignecommandeClientDto> ligneCommandeClients;
}
