package com.hotelboreal.hotel_boreal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "tb_reserva")
public class ReservaModel {

    @Id
    @Column(name = "id_reserva", nullable = false)
    Integer id_reserva;

    @Column(name = "data_check_in", nullable = false)
    LocalDate data_check_in;

    @Column(name = "data_check_out", nullable = false)
    LocalDate data_check_out;

   @Column(name = "status", nullable = false)
   Boolean status;

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
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
