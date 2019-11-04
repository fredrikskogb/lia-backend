package com.example.accessingdatamongodb;

import com.example.accessingdatamongodb.model.Customer;
import com.example.accessingdatamongodb.model.Order;
import com.example.accessingdatamongodb.model.Product;
import com.example.accessingdatamongodb.repository.CustomerRepository;
import com.example.accessingdatamongodb.repository.OrderRepository;
import com.example.accessingdatamongodb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


import java.time.LocalDate;

@SpringBootApplication
public class AccessingMongodbApplication implements CommandLineRunner {


	@Autowired
	private CustomerRepository repository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ProductRepository productRepository;


	public static void main(String[] args) {
		SpringApplication.run(AccessingMongodbApplication.class, args);
	}


	@DateTimeFormat(iso = ISO.DATE_TIME)
	protected LocalDate customerCreated = LocalDate.now();

	@Override
	public void run(String... args) throws Exception {
		/*repository.save(new Customer("Alice","Smith","1990-02-27","alice@smith.com", customerCreated));
		repository.save(new Customer("Bob","James","1983-04-14","bob@james.com", customerCreated));
*/
		/*orderRepository.deleteAll();
		if(orderRepository.findById("5d9b36a721052e1250b3acc1").isPresent()) {
			System.out.println(orderRepository.findAll());
			orderRepository.save(new Order("5d9b36a721052e1250b3acc1", "5db6bf3206e082048b393b3b", "0"));
		} else {
			orderRepository.save(new Order("5d9b36a721052e1250b3acc1", "5db6bf3206e082048b393b3b", "0"));
		}*/

		System.out.println(repository.findAll());


	}

}
