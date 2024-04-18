package com.sultowski.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sultowski.course.entities.Category;
import com.sultowski.course.entities.Order;
import com.sultowski.course.entities.User;
import com.sultowski.course.entities.enums.OrderStatus;
import com.sultowski.course.repositories.CategoryRepository;
import com.sultowski.course.repositories.OrderRepository;
import com.sultowski.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRep;
	@Autowired
	private UserRepository userRep;
	@Autowired
	private OrderRepository orderRep;

	@Override
	public void run(String... args) throws Exception {
		
		Category c1 = new Category(null, "Electronics"); 
		Category c2 = new Category(null, "Books"); 
		Category c3 = new Category(null, "Computers"); 

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, u1); 

		categoryRep.saveAll(Arrays.asList(c1,c2,c3));
		userRep.saveAll(Arrays.asList(u1,u2));
		orderRep.saveAll(Arrays.asList(o1,o2,o3));	} 
}
