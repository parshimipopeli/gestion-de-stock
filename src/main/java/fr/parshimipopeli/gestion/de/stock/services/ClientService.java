package fr.parshimipopeli.gestion.de.stock.services;

import fr.parshimipopeli.gestion.de.stock.dto.ClientDto;
import fr.parshimipopeli.gestion.de.stock.entity.Client;
import fr.parshimipopeli.gestion.de.stock.mapper.ClientDtoMapper;
import fr.parshimipopeli.gestion.de.stock.repository.ClientRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
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

    public Client searchOne(Long id) {
        Optional<Client> optionalClient = this.clientRepository.findById(id);
        return optionalClient.orElseThrow(
                 () -> new EntityNotFoundException("Aucun client n'existe avec cet ID")
        );
    }

    public void updateOne(Long id, Client client) {
        Client clientEnBDD = this.searchOne(id);
        if (clientEnBDD.getId() == client.getId()) {
            clientEnBDD.setNom(client.getNom());
            clientEnBDD.setPrenom(client.getPrenom());
            clientEnBDD.setPhoto(client.getPhoto());
            clientEnBDD.setEmail(client.getEmail());
            this.clientRepository.save(clientEnBDD);
        }
    }

    public void deleteOne(Long id) {
        this.clientRepository.deleteById(id);
    }
}
