package com.hotelboreal.hotel_boreal.model;


import com.hotelboreal.hotel_boreal.enums.QuartoStatus;
import com.hotelboreal.hotel_boreal.enums.TipoDeQuarto;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_quarto")
public class QuartoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_quarto")
    private int id_quarto;

    @Column(name = "numero_do_quarto")
    private int numero_do_quarto;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoDeQuarto tipo;

    @Column(name = "capacidade")
    private int capacidade;

    @Column(name = "preco_por_noite")
    private double preco_por_noite;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private QuartoStatus status;
}
