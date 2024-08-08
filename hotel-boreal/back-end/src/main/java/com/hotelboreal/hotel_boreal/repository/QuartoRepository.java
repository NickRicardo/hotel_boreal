package com.hotelboreal.hotel_boreal.repository;

import com.hotelboreal.hotel_boreal.model.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Integer> {
}
