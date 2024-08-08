package com.hotelboreal.hotel_boreal.model;


import com.hotelboreal.hotel_boreal.enums.QuartoStatus;
import com.hotelboreal.hotel_boreal.enums.TipoDeQuarto;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_quarto")
public class Quarto {

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

    public int getId_quarto() {
        return id_quarto;
    }

    public void setId_quarto(int id_quarto) {
        this.id_quarto = id_quarto;
    }

    public int getNumero_do_quarto() {
        return numero_do_quarto;
    }

    public void setNumero_do_quarto(int numero_do_quarto) {
        this.numero_do_quarto = numero_do_quarto;
    }

    public TipoDeQuarto getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeQuarto tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getPreco_por_noite() {
        return preco_por_noite;
    }

    public void setPreco_por_noite(double preco_por_noite) {
        this.preco_por_noite = preco_por_noite;
    }

    public QuartoStatus getStatus() {
        return status;
    }

    public void setStatus(QuartoStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "QuartoModel{" +
                "id_quarto=" + id_quarto +
                ", numero_do_quarto=" + numero_do_quarto +
                ", tipo=" + tipo +
                ", capacidade=" + capacidade +
                ", preco_por_noite=" + preco_por_noite +
                ", status=" + status +
                '}';
    }
}
