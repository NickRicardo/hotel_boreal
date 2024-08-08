package com.hotelboreal.hotel_boreal.service;

import com.hotelboreal.hotel_boreal.model.Quarto;
import com.hotelboreal.hotel_boreal.repository.QuartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuartoService {

    @Autowired
    QuartoRepository quartoRepository;

    public List<Quarto> obterQuartos(){
        return quartoRepository.findAll();
    }
}
