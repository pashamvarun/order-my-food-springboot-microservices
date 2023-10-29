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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.booking.Restaurantvo.ResponseTemplate;
import com.example.booking.model.Restaurant;
import com.example.booking.service.Restaurantservice;

@RestController
@RequestMapping("api/Restaurant")
public class Restaurantcontroller {
	@Autowired
	private Restaurantservice restaurantservice;

	public Restaurantcontroller(Restaurantservice restaurantservice) {
		super();
		this.restaurantservice = restaurantservice;
	}
	@GetMapping("/getallrestaurants")
	public List<Restaurant> getAllRestaurant() {
	    return restaurantservice.getAllRestaurant();
	}
	@PostMapping("/saverestaurant")
	public ResponseEntity<Restaurant>saveRestaurant(@RequestBody Restaurant restaurant){
		return new ResponseEntity<Restaurant>(restaurantservice.saveRestaurant(restaurant),HttpStatus.CREATED );
    }
	@PutMapping("/updaterestaurant/{id}")
	public Restaurant updateRestaurant(@PathVariable("id")Long restaurantid,@RequestBody Restaurant restaurant){
		return restaurantservice.updateRestaurant(restaurant, restaurantid);
	}
	
	@DeleteMapping("/deleterestaurant/{id}")
	public ResponseEntity<Restaurant> deleteRestaurant(@PathVariable("id")Long restaurantid){
		restaurantservice.deleteRestaurant(restaurantid);
		return new ResponseEntity<Restaurant>(HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseTemplate getrestaurantwithorder(@PathVariable("id") Long restaurantid) {
		return restaurantservice.getrestaurantwithorder(restaurantid);
	}
}


