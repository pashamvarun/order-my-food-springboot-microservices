package com.example.booking.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {
	@Id
private Long restaurantid;
	@Column(name = "name")
private String name;
	@Column(name = "location")
private String location;
	@Column(name = "cuisine")
private String cuisine;
	@Column(name = "distance")
private Long distance;
	@Column(name = "budget")
private Long budget;
	@Column(name = "orderid")
	private Long orderid;
	@OneToMany(mappedBy="restaurant",cascade = CascadeType.MERGE)
    private Set<Restaurantmenu> restaurantmenu;
    
	public Restaurant() {
	super();
	// TODO Auto-generated constructor stub
}
	public Restaurant(Long restaurantid, String name, String location, String cuisine, Long distance, Long budget,
			Long orderid, Set<Restaurantmenu> restaurantmenu) {
		super();
		this.restaurantid = restaurantid;
		this.name = name;
		this.location = location;
		this.cuisine = cuisine;
		this.distance = distance;
		this.budget = budget;
		this.orderid = orderid;
		this.restaurantmenu = restaurantmenu;
	}
	public Long getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(Long restaurantid) {
		this.restaurantid = restaurantid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public Long getDistance() {
		return distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}
	public Long getBudget() {
		return budget;
	}
	public void setBudget(Long budget) {
		this.budget = budget;
	}
	public Long getOrderid() {
		return orderid;
	}
	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	public Set<Restaurantmenu> getRestaurantmenu() {
		return restaurantmenu;
	}
	public void setRestaurantmenu(Set<Restaurantmenu> restaurantmenu) {
		this.restaurantmenu = restaurantmenu;
	}






}
