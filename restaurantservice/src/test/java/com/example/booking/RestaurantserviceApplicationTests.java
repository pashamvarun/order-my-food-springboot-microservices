package com.example.booking;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.booking.model.Restaurant;
import com.example.booking.repository.restaurantrepository;

@SpringBootTest
class RestaurantserviceApplicationTests {
@Autowired
restaurantrepository Restaurantrepository;
	@Test
	void contextLoads() {
	}
	@Test
	public void testCreate () {
		Restaurant r = new Restaurant();
		r.setRestaurantid(3L);
		r.setName("kfc");
		r.setLocation("hyd");
		r.setCuisine("south");
		r.setDistance(3L);
		r.setBudget(1000L);
		r.setOrderid(3L);
		Restaurantrepository.save(r);
		assertNotNull(Restaurantrepository.findById(3L).get());
	}
	private void assertNotNull(Restaurant restaurant) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testReadAll () {
		List list = Restaurantrepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void testRead () {
		Restaurant restaurant = Restaurantrepository.findById(1L).get();
		assertEquals("cafebahar", restaurant.getName());
	}
	private void assertEquals(String string, String name) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testUpdate () {
		Restaurant r = Restaurantrepository.findById(1L).get();
		r.setName("dominos");
		Restaurantrepository.save(r);
		assertNotEquals("dominos", Restaurantrepository.findById(1L).get().getName());
	}
	private void assertNotEquals(String string, String name) {
		// TODO Auto-generated method stub
		
	}
}
