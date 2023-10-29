package com.example.booking.Restaurantvo;

import com.example.booking.model.Restaurant;

import lombok.Data;
@Data
public class ResponseTemplate {
private Restaurant restaurant;
private Order order;
public ResponseTemplate() {
	super();
	// TODO Auto-generated constructor stub
}
public ResponseTemplate(Restaurant restaurant, Order order) {
	super();
	this.restaurant = restaurant;
	this.order = order;
}
public Restaurant getRestaurant() {
	return restaurant;
}
public void setRestaurant(Restaurant restaurant) {
	this.restaurant = restaurant;
}
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
}
