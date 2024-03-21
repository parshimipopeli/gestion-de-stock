package fr.parshimipopeli.gestion.de.stock.controller;

import fr.parshimipopeli.gestion.de.stock.dto.ClientDto;
import fr.parshimipopeli.gestion.de.stock.entity.Client;
import fr.parshimipopeli.gestion.de.stock.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

import static org.springframework.http.HttpStatus.NO_CONTENT;

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

    @GetMapping(path = "{id}")
    public Client searchOne(@PathVariable Long id) {
        return this.clientService.searchOne(id);
    }

    @ResponseStatus(NO_CONTENT)
    @PutMapping(path = "{id}")
    public void updateOne(@PathVariable Long id, @RequestBody Client client ) {
        this.clientService.updateOne(id, client);
    }




}
