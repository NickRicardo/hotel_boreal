package com.hotelboreal.hotel_boreal.service;


import com.hotelboreal.hotel_boreal.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

}
