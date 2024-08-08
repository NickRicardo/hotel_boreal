package com.hotelboreal.hotel_boreal.service;

import com.hotelboreal.hotel_boreal.model.Reserva;
import com.hotelboreal.hotel_boreal.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    ReservaRepository reservaRepository;

    public List<Reserva> obterTodasReservas() {
        return reservaRepository.findAll();
    }

    public Optional<Reserva> obterReservaPorId(Integer id) {
        return reservaRepository.findById(id);
    }

    public Reserva adicionarReserva(Reserva reservaModel) {
        return reservaRepository.save(reservaModel);
    }

    public void deletarReserva(int id) {
        reservaRepository.deleteById(id);
    }

    public Reserva atualizarReserva(int id, Reserva atualizarReserva) {

        if (reservaRepository.existsById(id)) {
            atualizarReserva.setId_reserva(id);
            return reservaRepository.save(atualizarReserva);
        } else {
            throw new RuntimeException("Esta Reserva não existe em nosso Banco de dados.");
        }
    }
}
