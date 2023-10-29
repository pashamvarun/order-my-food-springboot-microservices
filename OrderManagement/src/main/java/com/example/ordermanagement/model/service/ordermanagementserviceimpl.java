package com.example.ordermanagement.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ordermanagement.model.Order;
import com.example.ordermanagement.repository.ordermanagementrepository;
@Service
public class ordermanagementserviceimpl implements ordermanagementservice{
	@Autowired
    ordermanagementrepository Ordermanagementrepository;
	public ordermanagementserviceimpl(ordermanagementrepository ordermanagementrepository) {
		super();
		Ordermanagementrepository = ordermanagementrepository;
	}

	@Override
	public List<Order> getAllorder() {
		return Ordermanagementrepository.findAll();
	}

	@Override
	public Order saveorder(Order order) {
		return Ordermanagementrepository.save(order);
	}

	@Override
	public Order updateorder(Order order, long orderid) {
		return Ordermanagementrepository.save(order);
	}

	@Override
	public void deleteorder(long orderid) {
		Ordermanagementrepository.deleteById(orderid);
		
	}

	@Override
	public Order findByorderid(Long orderid) {
		return Ordermanagementrepository.findByorderid(orderid);
		
	}

}
