package com.hotelboreal.hotel_boreal.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_quarto")
public class QuartoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_quarto;
    @Column(name = "numero_do_quarto")
    int numero_do_quarto;

    @Column(name = "capacidade")
    int capacidade;

    @Column(name = "preco_por_noite")
    double preco_por_noite;

    @Column(name = "status")
    boolean status;
}
