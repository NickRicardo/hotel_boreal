package com.hotelboreal.hotel_boreal.repository;

import com.hotelboreal.hotel_boreal.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository  extends JpaRepository<Reserva, Integer>{

}
