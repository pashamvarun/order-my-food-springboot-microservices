package com.example.ordermanagement.controller;

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

import com.example.ordermanagement.model.Order;
import com.example.ordermanagement.model.service.ordermanagementservice;
@RestController
@RequestMapping("api/ordermanagement")
public class ordermanagementcontroller {
	ordermanagementservice Ordermanagementservice;

	public ordermanagementcontroller(ordermanagementservice ordermanagementservice) {
		super();
		Ordermanagementservice = ordermanagementservice;
	}
	@PostMapping("/")
    public Order saveorder(@RequestBody Order order) {
        return  Ordermanagementservice.saveorder(order);
    }
	@GetMapping("/getorder/{id}")
    public Order findByorderid(@PathVariable("id") Long orderid) {
        return Ordermanagementservice.findByorderid(orderid);
}
	@PutMapping("/updateorder/{id}")
    public Order updateorder(@PathVariable("id")Long orderid,@RequestBody Order order){
		return Ordermanagementservice.updateorder(order, orderid);
	}
	
	@DeleteMapping("/deleteorder/{id}")
	public ResponseEntity<Order> deleteorder(@PathVariable("id")Long orderid){
		Ordermanagementservice.deleteorder(orderid);
		return new ResponseEntity<Order>(HttpStatus.OK);
	}
}
