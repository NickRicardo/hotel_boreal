package com.hotelboreal.hotel_boreal.controller;


import com.hotelboreal.hotel_boreal.model.ReservaModel;
import com.hotelboreal.hotel_boreal.repository.ReservaRepository;
import com.hotelboreal.hotel_boreal.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reserva")
public class ReservaController {


    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public List<ReservaModel>obterTodasReservas(){
        return reservaService.obterTodasReservas();
    }

    @GetMapping("/{id}")
    public Optional<ReservaModel>obterReservaPorId(@PathVariable int id){
        return reservaService.obterReservaPorId(id);
    }
}
