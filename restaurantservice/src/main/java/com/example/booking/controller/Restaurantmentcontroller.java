package com.example.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.booking.model.Restaurantmenu;
import com.example.booking.service.Restaurantmenuservice;
@RestController
public class Restaurantmentcontroller {
	@Autowired
	Restaurantmenuservice restaurantmenuservice ;
	
	public Restaurantmentcontroller(Restaurantmenuservice restaurantmenuservice) {
		super();
		this.restaurantmenuservice = restaurantmenuservice;
	}
	@GetMapping("/allrestaurantsmenu")
	public List<Restaurantmenu> getAllRestaurant() {
	    return restaurantmenuservice.getAllRestaurantmenu();
	}
	@PostMapping("/saverestaurant")
    public Restaurantmenu saveRestaurantmenu(@RequestBody Restaurantmenu restaurantmenu) {
        return restaurantmenuservice.saveRestaurantmenu(restaurantmenu);
    }
	@PutMapping
	public Restaurantmenu updateRestaurantmenu(@PathVariable("id")Long cuisineid,@RequestBody Restaurantmenu restaurantmenu){
		return restaurantmenuservice.updateRestaurantmenu(restaurantmenu, cuisineid);
	}
	
	@DeleteMapping
	public ResponseEntity<Restaurantmenu> deleteRestaurantmenu(@PathVariable("id")Long cuisineid){
		restaurantmenuservice.deleteRestaurantmenu(cuisineid);
		return new ResponseEntity<Restaurantmenu>(HttpStatus.OK);
	}
}
