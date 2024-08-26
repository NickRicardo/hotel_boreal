package com.hotelboreal.hotel_boreal.service;


import com.hotelboreal.hotel_boreal.model.Cliente;
import com.hotelboreal.hotel_boreal.model.Quarto;
import com.hotelboreal.hotel_boreal.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> obterCliente(){
       return clienteRepository.findAll();
    }

    public Optional<Cliente> obterClientePorId(Integer id){
        return clienteRepository.findById(id);
    }

    public void deletarCliente(Integer id){
        clienteRepository.deleteById(id);
    }

    public Cliente adicionarcliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(int id, Cliente cliente){

        if (clienteRepository.existsById(id)){
            cliente.setId(id);
            return clienteRepository.save(cliente);
        }else {
            throw new RuntimeException("Este Cliente não consta em nosso banco de dados.");
        }
    }

}
