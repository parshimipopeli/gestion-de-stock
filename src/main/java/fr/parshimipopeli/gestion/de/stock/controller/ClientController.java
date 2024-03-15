package fr.parshimipopeli.gestion.de.stock.controller;

import fr.parshimipopeli.gestion.de.stock.dto.ClientDto;
import fr.parshimipopeli.gestion.de.stock.entity.Client;
import fr.parshimipopeli.gestion.de.stock.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

@RestController
@RequestMapping("client")
public class ClientController {

    private  ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping
    private void create(@RequestBody Client client) {
        this.clientService.create(client);
    }

    @GetMapping
    public Stream<ClientDto> search() {
        return this.clientService.search();
    }
}
