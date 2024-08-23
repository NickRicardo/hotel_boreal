package com.hotelboreal.hotel_boreal.model;

import java.time.LocalDate;

public class Cliente extends Pessoa{

    public Cliente(int id, String nome, String cpf, String email, String telefone, LocalDate data_de_nascimento) {
        super(id, nome, cpf, email, telefone, data_de_nascimento);
    }
}
