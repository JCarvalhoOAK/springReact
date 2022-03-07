package br.com.tecnologiamaster.domain;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.tecnologiamaster.domain.entities.Client;
import br.com.tecnologiamaster.domain.entities.Order;
import br.com.tecnologiamaster.domain.entities.OrderItem;
import br.com.tecnologiamaster.domain.entities.OrderStatus;
import br.com.tecnologiamaster.domain.entities.Product;
import br.com.tecnologiamaster.domain.repositories.ClientRepository;
import br.com.tecnologiamaster.domain.repositories.OrderItemRepository;
import br.com.tecnologiamaster.domain.repositories.OrderRepository;
import br.com.tecnologiamaster.domain.repositories.ProductRepository;


@SpringBootApplication
public class DomainApplication implements CommandLineRunner {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(DomainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client(null, "Rafael Souza", "rafasouza@gmail.com");

		clientRepository.save(c1);

		Product p1 = new Product(null, "TV", 1000.0);
		Product p2 = new Product(null, "Mouse", 40.0);
		Product p3 = new Product(null, "PC", 1200.0);

		productRepository.saveAll(Arrays.asList(p1, p2, p3));

		Order o1 = new Order(null, Instant.parse("2022-04-18T11:25:09Z"), OrderStatus.PAID, c1);
		Order o2 = new Order(null, Instant.parse("2022-04-20T13:30:00Z"), OrderStatus.WAITING, c1);

		orderRepository.saveAll(Arrays.asList(o1, o2));

		OrderItem i1 = new OrderItem(null, 1, 1000.0, p1, o1);
		OrderItem i2 = new OrderItem(null, 2, 40.0, p2, o1);
		OrderItem i3 = new OrderItem(null, 1, 40.0, p2, o2);
		OrderItem i4 = new OrderItem(null, 1, 1200.0, p3, o2);

		orderItemRepository.saveAll(Arrays.asList(i1, i2, i3, i4));
	}
}
