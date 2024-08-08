package com.hotelboreal.hotel_boreal.service;

import com.hotelboreal.hotel_boreal.model.ReservaModel;
import com.hotelboreal.hotel_boreal.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    ReservaRepository reservaRepository;

    public List<ReservaModel> obterTodasReservas() {
        return reservaRepository.findAll();
    }

    public Optional<ReservaModel> obterReservaPorId(Integer id) {
        return reservaRepository.findById(id);
    }

    public ReservaModel adicionarReserva(ReservaModel reservaModel) {
        return reservaRepository.save(reservaModel);
    }

    public void deletarReserva(int id) {
        reservaRepository.deleteById(id);
    }

    public ReservaModel atualizarReserva(int id, ReservaModel atualizarReserva) {

        if (reservaRepository.existsById(id)) {
            atualizarReserva.setId_reserva(id);
            return reservaRepository.save(atualizarReserva);
        } else {
            throw new RuntimeException("Esta Reserva não existe em nosso Banco de dados.");
        }
    }
}
