package com.example.booking.Restaurantvo;

public class Order {
	private long orderid ;
	private String orderitem;
	private long itemprice;
	private long orderquantity;
	private long bill;
	
	public Order() {
		super();
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
