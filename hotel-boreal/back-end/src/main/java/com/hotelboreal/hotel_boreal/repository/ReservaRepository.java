package com.hotelboreal.hotel_boreal.repository;

import com.hotelboreal.hotel_boreal.model.ReservaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReservaRepository  extends JpaRepository<ReservaModel, Integer>{

}
