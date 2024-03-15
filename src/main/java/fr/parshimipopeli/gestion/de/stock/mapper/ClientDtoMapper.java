package fr.parshimipopeli.gestion.de.stock.mapper;


import fr.parshimipopeli.gestion.de.stock.dto.ClientDto;
import fr.parshimipopeli.gestion.de.stock.entity.Client;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component
public class ClientDtoMapper implements Function<Client, ClientDto> {
    @Override
    public ClientDto apply(@NotNull Client client) {
        return new ClientDto(client.getNom(), client.getPrenom(), client.getEmail(), client.getAdresse(), client.getTelephone());

    }


}
