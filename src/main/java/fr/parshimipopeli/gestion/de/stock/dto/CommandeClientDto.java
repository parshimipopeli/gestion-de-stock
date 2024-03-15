package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.entity.StatusCommande;

import java.util.Date;
import java.util.List;


public class CommandeClientDto {

    private Long id;

    private String codeCommande;

    private Date dateCommande;

    private StatusCommande statusCommande;

    private ClientDto client;

    private Integer idEntreprise;

    private List<LignecommandeClientDto> ligneCommandeClients;

}
