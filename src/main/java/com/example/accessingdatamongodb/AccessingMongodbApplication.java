package com.example.accessingdatamongodb;
import com.example.accessingdatamongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AccessingMongodbApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AccessingMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(repository.findAll());

	}

}
