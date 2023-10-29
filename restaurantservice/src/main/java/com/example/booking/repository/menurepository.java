package com.example.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking.model.Restaurantmenu;

public interface menurepository extends JpaRepository<Restaurantmenu, Long>{

}
