package com.hotelboreal.hotel_boreal.service;

import com.hotelboreal.hotel_boreal.model.Quarto;
import com.hotelboreal.hotel_boreal.repository.QuartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuartoService {

    @Autowired
    QuartoRepository quartoRepository;

    public List<Quarto> obterQuartos(){
        return quartoRepository.findAll();
    }

    public Optional<Quarto> obterQuartoPorId(Integer id){
        return quartoRepository.findById(id);
    }

    public void deletarQuarto(Integer id){
        quartoRepository.deleteById(id);
    }

    public Quarto adicionarQuarto(Quarto quarto){
        return quartoRepository.save(quarto);
    }

    public Quarto atualizarQuarto(int id, Quarto quarto){

        if (quartoRepository.existsById(id)){
            quarto.setId_quarto(id);
            return quartoRepository.save(quarto);
        }else {
            throw new RuntimeException("Este Quarto não consta em nosso banco de dados.");
        }
    }

}
