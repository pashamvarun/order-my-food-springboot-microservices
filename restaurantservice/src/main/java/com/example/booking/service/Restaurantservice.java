package com.example.booking.service;

import java.util.List;

import com.example.booking.Restaurantvo.ResponseTemplate;
import com.example.booking.model.Restaurant;

public interface Restaurantservice {
	List <Restaurant> getAllRestaurant();
    Restaurant saveRestaurant(Restaurant restaurant);
    Restaurant updateRestaurant(Restaurant restaurant,Long restaurantid);
	void deleteRestaurant(Long restaurantid);
	
	ResponseTemplate getrestaurantwithorder(Long restaurantid);
}
