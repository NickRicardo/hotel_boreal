package com.hotelboreal.hotel_boreal.controller;

import com.hotelboreal.hotel_boreal.model.Quarto;
import com.hotelboreal.hotel_boreal.repository.QuartoRepository;
import com.hotelboreal.hotel_boreal.service.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quarto")
public class QuartoController {

    @Autowired
    private QuartoService quartoService;

    @Autowired
    QuartoRepository quartoRepository;

    @GetMapping
    public List<Quarto> obterQuartos() {
        return quartoService.obterQuartos();
    }

    @GetMapping("/{id}")
    public Optional<Quarto> quartoPorId(@PathVariable int id) {
        return quartoService.obterQuartoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarQuarto(@PathVariable int id) {
        quartoService.deletarQuarto(id);
    }

    @PostMapping
    public Quarto adicionarQuarto(@RequestBody Quarto quarto) {
        return quartoService.adicionarQuarto(quarto);
    }

    @PutMapping("/{id}")
    public Quarto atualizarQuarto(@PathVariable int id, @RequestBody Quarto quarto) {
        return quartoService.atualizarQuarto(id, quarto);
    }

}
