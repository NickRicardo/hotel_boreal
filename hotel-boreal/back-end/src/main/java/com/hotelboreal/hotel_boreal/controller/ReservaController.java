package com.hotelboreal.hotel_boreal.controller;


import com.hotelboreal.hotel_boreal.model.ReservaModel;
import com.hotelboreal.hotel_boreal.repository.ReservaRepository;
import com.hotelboreal.hotel_boreal.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public List<ReservaModel> obterTodasReservas() {
        return reservaService.obterTodasReservas();
    }

    @GetMapping("/{id}")
    public Optional<ReservaModel> obterReservaPorId(@PathVariable int id) {
        return reservaService.obterReservaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        reservaService.deletarReserva(id);
    }

    @PostMapping
    public ReservaModel adicionarReserva(@RequestBody ReservaModel reservaModel) {
        return reservaRepository.save(reservaModel);
    }

    @PutMapping("/{id}")
    public ReservaModel atualizarReserva(@PathVariable int id, @RequestBody ReservaModel reservaModel){
        return reservaService.atualizarReserva(id, reservaModel);
    }
}
