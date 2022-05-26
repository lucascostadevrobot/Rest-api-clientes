package com.ticketapi.TicketOn.controller;

import com.ticketapi.TicketOn.model.Cliente;
import com.ticketapi.TicketOn.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired //Instanciar essa implementação em tempo de execução
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll(); //Usa a instancia para listar
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar( @RequestBody  Cliente cliente){
        return clienteRepository.save(cliente);
    }

}
