package com.hotelboreal.hotel_boreal.controller;


import com.hotelboreal.hotel_boreal.model.Reserva;
import com.hotelboreal.hotel_boreal.repository.ReservaRepository;
import com.hotelboreal.hotel_boreal.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    ReservaRepository reservaRepository;

    @GetMapping
    public List<Reserva> obterTodasReservas() {
        return reservaService.obterTodasReservas();
    }

    @GetMapping("/{id}")
    public Optional<Reserva> obterReservaPorId(@PathVariable int id) {
        return reservaService.obterReservaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        reservaService.deletarReserva(id);
    }

    @PostMapping
    public Reserva adicionarReserva(@RequestBody Reserva reservaModel) {
        return reservaRepository.save(reservaModel);
    }

    @PutMapping("/{id}")
    public Reserva atualizarReserva(@PathVariable int id, @RequestBody Reserva reservaModel){
        return reservaService.atualizarReserva(id, reservaModel);
    }
}
