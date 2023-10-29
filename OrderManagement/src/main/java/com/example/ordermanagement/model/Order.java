package com.example.ordermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
@Id
private long orderid ;
@Column(name = "orderitem")
private String orderitem;
@Column(name = "itemprice")
private long itemprice;
@Column(name = "orderquantity")
private long orderquantity;
@Column(name = "bill")
private long bill;

public Order() {
	super();
	// TODO Auto-generated constructor stub
}

public Order(long orderid, String orderitem, long itemprice, long orderquantity, long bill) {
	super();
	this.orderid = orderid;
	this.orderitem = orderitem;
	this.itemprice = itemprice;
	this.orderquantity = orderquantity;
	this.bill = bill;
}

public long getOrderid() {
	return orderid;
}

public void setOrderid(long orderid) {
	this.orderid = orderid;
}

public String getOrderitem() {
	return orderitem;
}

public void setOrderitem(String orderitem) {
	this.orderitem = orderitem;
}

public long getItemprice() {
	return itemprice;
}

public void setItemprice(long itemprice) {
	this.itemprice = itemprice;
}

public long getOrderquantity() {
	return orderquantity;
}

public void setOrderquantity(long orderquantity) {
	this.orderquantity = orderquantity;
}

public long getBill() {
	return bill;
}

public void setBill(long bill) {
	this.bill = bill;
}


}
