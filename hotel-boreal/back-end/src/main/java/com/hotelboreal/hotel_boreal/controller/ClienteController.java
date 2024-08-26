package com.hotelboreal.hotel_boreal.controller;

import com.hotelboreal.hotel_boreal.model.Cliente;
import com.hotelboreal.hotel_boreal.repository.ClienteRepository;
import com.hotelboreal.hotel_boreal.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.ref.Cleaner;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @Autowired
    ClienteRepository clienteRepository;


    @GetMapping
    public List<Cliente> todosClientes() {
        return clienteService.obterCliente();
    }

    @GetMapping("{id}")
    public Optional<Cliente> obterClientePorId(@PathVariable int id){
        return clienteService.obterClientePorId(id);
    }

    @DeleteMapping("{id}")
    public void deletarCliente(@PathVariable int id){
        clienteService.deletarCliente(id);
    }

    @PutMapping("{id}")
    public Cliente atualizarCliente(@PathVariable int id, @RequestBody Cliente cliente){
        return clienteService.atualizarCliente(id, cliente);
    }

}

