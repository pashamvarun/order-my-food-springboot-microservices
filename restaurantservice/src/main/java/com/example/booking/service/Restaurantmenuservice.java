package com.example.booking.service;

import java.util.List;

import com.example.booking.model.Restaurantmenu;

public interface Restaurantmenuservice {
	List <Restaurantmenu> getAllRestaurantmenu();
	Restaurantmenu saveRestaurantmenu(Restaurantmenu restaurantmenu);
	Restaurantmenu updateRestaurantmenu(Restaurantmenu restaurantmenu,long cuisineid);
	void deleteRestaurantmenu(long cuisineid);
}
