package com.example.ordermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ordermanagement.model.Order;
@Repository
public interface ordermanagementrepository extends JpaRepository<Order, Long> {


	 Order findByorderid(Long orderid) ;
	

	
	

}
