package com.hotelboreal.hotel_boreal.repository;

import com.hotelboreal.hotel_boreal.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
