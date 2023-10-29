package com.example.gatewayeureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	 @GetMapping("/restaurantServiceFallBack")
	    public String restaurantServiceFallBackMethod() {
	        return "restaurant Service is taking longer than Expected." +
	                " Please try again later";
	    }

	    @GetMapping("/orderServiceFallBack")
	    public String orderServiceFallBackMethod() {
	        return "order Service is taking longer than Expected." +
	                " Please try again later";
	    }
}
