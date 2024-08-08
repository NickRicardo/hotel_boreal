package com.hotelboreal.hotel_boreal.controller;

import com.hotelboreal.hotel_boreal.model.Quarto;
import com.hotelboreal.hotel_boreal.repository.QuartoRepository;
import com.hotelboreal.hotel_boreal.service.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quarto")
public class QuartoController {

    @Autowired
    private QuartoService quartoService;

    @Autowired
    QuartoRepository quartoRepository;

    @GetMapping
    public List<Quarto> obterQuartos(){
       return quartoService.obterQuartos();
    }
}
