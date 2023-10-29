package com.example.ordermanagement.model.service;

import java.util.List;

import com.example.ordermanagement.model.Order;

public interface ordermanagementservice {
	List <Order> getAllorder();
	Order saveorder(Order order);
	Order updateorder(Order order,long orderid);
	void deleteorder(long orderid);
	Order findByorderid(Long orderid);
	 
	

}