package com.example.ordermanagement;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.ordermanagement.model.Order;
import com.example.ordermanagement.repository.ordermanagementrepository;

@SpringBootTest
class OrderManagementApplicationTests {
@Autowired
ordermanagementrepository Ordermanagementrepository;
	@Test
	void contextLoads() {
	}
	@Test
	public void testCreateorder () {
		Order o = new Order();
		o.setOrderid(3L);
		o.setOrderitem("dosa");
		o.setItemprice(50L);
		o.setOrderquantity(2L);
		o.setBill(100L);
		Ordermanagementrepository.save(o);
		assertNotNull(Ordermanagementrepository.findById(3L).get());
	}
	private void assertNotNull(Order order) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testReadAll () {
		List list = Ordermanagementrepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void testReadorder () {
		Order order = Ordermanagementrepository.findById(3L).get();
		assertEquals(100, order.getBill());
	}
	private void assertEquals(int i, long bill) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testDeleteorder () {
		Ordermanagementrepository.deleteById(3L);
		assertThat(Ordermanagementrepository.existsById(3L)).isFalse();
	}

}
