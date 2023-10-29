package com.example.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.booking.Restaurantvo.Order;
import com.example.booking.Restaurantvo.ResponseTemplate;
import com.example.booking.model.Restaurant;
import com.example.booking.repository.restaurantrepository;


@Service
public class Restaurantserviceimpl implements Restaurantservice{
	@Autowired
	private RestTemplate restTemplate;
	public Restaurantserviceimpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	public Restaurantserviceimpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
    private restaurantrepository Restaurantrepository;
	public Restaurantserviceimpl(restaurantrepository restaurantrepository) {
		super();
		Restaurantrepository = restaurantrepository;
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		
		return Restaurantrepository.findAll();
	}

	@Override
	public Restaurant saveRestaurant(Restaurant restaurant) {
		
		return Restaurantrepository.save(restaurant);
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant, Long restaurantid) {
		
		return Restaurantrepository.save(restaurant);
	}

	@Override
	public void deleteRestaurant(Long restaurantid) {
		Restaurantrepository.deleteById(restaurantid);
		
	}

	@Override
	public ResponseTemplate getrestaurantwithorder(Long restaurantid) {
		ResponseTemplate responsetemplate=new ResponseTemplate();
		Restaurant restaurant =Restaurantrepository.findByRestaurantid(restaurantid);
		Order order=restTemplate.getForObject("http://ORDERMANAGEMENT/api/ordermanagement/"+restaurant.getOrderid(), Order.class);
		responsetemplate.setRestaurant(restaurant);
		responsetemplate.setOrder(order);
		return responsetemplate;
	}

	
}
