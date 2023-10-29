package com.example.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booking.model.Restaurantmenu;
import com.example.booking.repository.menurepository;
@Service
public class Restaurantmenuserviceimpl implements Restaurantmenuservice {
	@Autowired
private menurepository Menurepository;
	public Restaurantmenuserviceimpl(menurepository menurepository) {
	super();
	Menurepository = menurepository;
}

	@Override
	public List<Restaurantmenu> getAllRestaurantmenu() {
		// TODO Auto-generated method stub
		return Menurepository.findAll();
	}

	@Override
	public Restaurantmenu saveRestaurantmenu(Restaurantmenu restaurantmenu) {
		// TODO Auto-generated method stub
		return Menurepository.save(restaurantmenu);
	}

	@Override
	public Restaurantmenu updateRestaurantmenu(Restaurantmenu restaurantmenu, long Restaurantid) {
		// TODO Auto-generated method stub
		return Menurepository.save(restaurantmenu);
	}

	@Override
	public void deleteRestaurantmenu(long Restaurantid) {
		// TODO Auto-generated method stub
		Menurepository.deleteById(Restaurantid);
	}

}
