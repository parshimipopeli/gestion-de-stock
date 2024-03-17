package fr.parshimipopeli.gestion.de.stock.services;

import fr.parshimipopeli.gestion.de.stock.dto.ClientDto;
import fr.parshimipopeli.gestion.de.stock.entity.Article;
import fr.parshimipopeli.gestion.de.stock.entity.Client;
import fr.parshimipopeli.gestion.de.stock.mapper.ClientDtoMapper;
import fr.parshimipopeli.gestion.de.stock.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    private ClientDtoMapper clientDtoMapper;

    public ClientService(ClientRepository clientRepository, ClientDtoMapper clientDtoMapper) {
        this.clientRepository = clientRepository;
        this.clientDtoMapper = clientDtoMapper;
    }

    public void create(Client client) {
        Client clientEnBDD = this.clientRepository.findByEmail(client.getEmail());
        if (clientEnBDD == null) {
            this.clientRepository.save(client);
        }
    }

    public Stream<ClientDto> search() {
        return this.clientRepository.findAll()
                .stream().map(clientDtoMapper);
    }
}
