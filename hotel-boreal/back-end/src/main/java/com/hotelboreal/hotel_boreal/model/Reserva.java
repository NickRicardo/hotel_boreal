package com.hotelboreal.hotel_boreal.model;

import com.hotelboreal.hotel_boreal.enums.ReservaStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva", nullable = false)
    private Integer id_reserva;

    @Column(name = "data_check_in", nullable = false)
    private LocalDate data_check_in;

    @Column(name = "data_check_out", nullable = false)
    private LocalDate data_check_out;


    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private ReservaStatus status;

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public LocalDate getData_check_in() {
        return data_check_in;
    }

    public void setData_check_in(LocalDate data_check_in) {
        this.data_check_in = data_check_in;
    }

    public LocalDate getData_check_out() {
        return data_check_out;
    }

    public void setData_check_out(LocalDate data_check_out) {
        this.data_check_out = data_check_out;
    }

    public ReservaStatus getStatus() {
        return status;
    }

    public void setStatus(ReservaStatus status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "ReservaModel{" +
                "id_reserva=" + id_reserva +
                ", data_check_in=" + data_check_in +
                ", data_check_out=" + data_check_out +
                ", status=" + status +
                '}';
    }
}
