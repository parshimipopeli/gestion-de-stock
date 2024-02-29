package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.model.CommandeClient;
import fr.parshimipopeli.gestion.de.stock.model.StatusCommande;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Long id;

    private String codeCommande;

    private Date dateCommande;

    private StatusCommande statusCommande;

    private ClientDto client;

    private Integer idEntreprise;

    private List<LignecommandeClientDto> ligneCommandeClients;

    public static CommandeClientDto fromEntity(CommandeClient commandeClient) {
        if (commandeClient == null) {
            return null;
        }

        return CommandeClientDto.builder()
                .codeCommande(commandeClient.getCodeCommande())
                .dateCommande(commandeClient.getDateCommande())
                .statusCommande(commandeClient.getStatusCommande())
                .client(ClientDto.fromEntity(commandeClient.getClient()))
                .idEntreprise(commandeClient.getIdEntreprise())
                .build();
    }

    public static CommandeClient toEntity(CommandeClientDto commandeClientDto) {
        if (commandeClientDto == null) {
            return null;
        }
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setCodeCommande(commandeClientDto.getCodeCommande());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        commandeClient.setStatusCommande(commandeClientDto.getStatusCommande());
        commandeClient.setClient(ClientDto.toEntity(commandeClientDto.getClient()));
        commandeClient.setIdEntreprise(commandeClientDto.getIdEntreprise());
        return commandeClient;
    }
}
