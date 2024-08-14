package com.hotelboreal.hotel_boreal.model.dto;

import java.time.LocalDate;

public class ReservaDTO {

    private LocalDate data_check_in;

    private LocalDate data_check_out;

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
}
