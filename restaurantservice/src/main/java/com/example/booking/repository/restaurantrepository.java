package com.example.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking.model.Restaurant;

public interface restaurantrepository extends JpaRepository<Restaurant, Long> {

	Restaurant findByRestaurantid(Long restaurantid);

	

}
