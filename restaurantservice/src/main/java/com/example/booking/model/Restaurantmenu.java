package com.example.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Restaurantmenu {
	@Id
	private long cuisineid;
	@Column(name = "cuisinename")
    private String cuisinename;
	@Column(name = "item1")
	private String item1;
	@Column(name = "item2")
	private String item2;
	@Column(name = "item3")
	private String item3;
	@ManyToOne
    private Restaurant restaurant;

public Restaurantmenu() {
	super();
	}
public Restaurantmenu(long cuisineid, String cuisinename, String item1, String item2, String item3) {
	super();
	this.cuisineid = cuisineid;
	this.cuisinename = cuisinename;
	this.item1 = item1;
	this.item2 = item2;
	this.item3 = item3;
}
public long getCuisineid() {
	return cuisineid;
}
public void setCuisineid(long cuisineid) {
	this.cuisineid = cuisineid;
}
public String getCuisinename() {
	return cuisinename;
}


public void setCuisinename(String cuisinename) {
	this.cuisinename = cuisinename;
}


public String getItem1() {
	return item1;
}


public void setItem1(String item1) {
	this.item1 = item1;
}


public String getItem2() {
	return item2;
}


public void setItem2(String item2) {
	this.item2 = item2;
}


public String getItem3() {
	return item3;
}


public void setItem3(String item3) {
	this.item3 = item3;
}


}


