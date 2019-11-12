package com.example.accessingdatamongodb;
import com.example.accessingdatamongodb.model.Translations;
import com.example.accessingdatamongodb.repository.CustomerRepository;
import com.example.accessingdatamongodb.repository.TranslationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AccessingMongodbApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;
	@Autowired
	private TranslationsRepository translationsRepository;

	public static void main(String[] args) {
		SpringApplication.run(AccessingMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(repository.findAll());

		translationsRepository.deleteAll();

		translationsRepository.save(new Translations(
				"en",
				"home",
				"Home"
		));
		translationsRepository.save(new Translations(
				"en",
				"customers",
				"Customers"
		));
		translationsRepository.save(new Translations(
				"en",
				"orders",
				"Orders"
		));
		translationsRepository.save(new Translations(
				"en",
				"products",
				"Products"
		));
		translationsRepository.save(new Translations(
				"en",
				"logIn",
				"Log in"
		));
		translationsRepository.save(new Translations(
				"en",
				"email",
				"E-mail"
		));
		translationsRepository.save(new Translations(
				"en",
				"enterEmail",
				"Enter e-mail..."
		));
		translationsRepository.save(new Translations(
				"en",
				"password",
				"Password"
		));
		translationsRepository.save(new Translations(
				"en",
				"enterPassword",
				"Enter password..."
		));
		translationsRepository.save(new Translations(
				"en",
				"loginRegister",
				"Don't have an account? Register here."
		));
		translationsRepository.save(new Translations(
				"en",
				"registerLogin",
				"Already have an account? Login here."
		));
		translationsRepository.save(new Translations(
				"en",
				"firstName",
				"First name"
		));
		translationsRepository.save(new Translations(
				"en",
				"enterFirstName",
				"Enter first name"
		));
		translationsRepository.save(new Translations(
				"en",
				"lastName",
				"Last name"
		));
		translationsRepository.save(new Translations(
				"en",
				"enterLastName",
				"Enter last name..."
		));
		translationsRepository.save(new Translations(
				"en",
				"birthDate",
				"Birth date"
		));
		translationsRepository.save(new Translations(
				"en",
				"carouselTitle",
				"Newest subscriptions"
		));
		translationsRepository.save(new Translations(
				"en",
				"subscribe",
				"Subscribe"
		));




		translationsRepository.save(new Translations(
				"sv",
				"home",
				"Hem"
		));
		translationsRepository.save(new Translations(
				"sv",
				"customers",
				"Kunder"
		));
		translationsRepository.save(new Translations(
				"sv",
				"orders",
				"Ordrar"
		));
		translationsRepository.save(new Translations(
				"sv",
				"products",
				"Produkter"
		));
		translationsRepository.save(new Translations(
				"sv",
				"logIn",
				"Logga in"
		));
		translationsRepository.save(new Translations(
				"sv",
				"email",
				"E-mail"
		));
		translationsRepository.save(new Translations(
				"sv",
				"enterEmail",
				"Skriv in e-mail..."
		));
		translationsRepository.save(new Translations(
				"sv",
				"password",
				"Lösenord"
		));
		translationsRepository.save(new Translations(
				"sv",
				"enterPassword",
				"Skriv in lösenord..."
		));
		translationsRepository.save(new Translations(
				"sv",
				"loginRegister",
				"Har du inget konto? Registrera dig här."
		));
		translationsRepository.save(new Translations(
				"sv",
				"registerLogin",
				"Har du redan ett konto? Logga in här."
		));
		translationsRepository.save(new Translations(
				"sv",
				"firstName",
				"Förnamn"
		));
		translationsRepository.save(new Translations(
				"sv",
				"enterFirstName",
				"Skriv in förnamn..."
		));
		translationsRepository.save(new Translations(
				"sv",
				"lastName",
				"Efternamn"
		));
		translationsRepository.save(new Translations(
				"sv",
				"enterLastName",
				"Skriv in efternamn..."
		));
		translationsRepository.save(new Translations(
				"sv",
				"birthDate",
				"Födelsedatum"
		));
		translationsRepository.save(new Translations(
				"sv",
				"carouselTitle",
				"Senaste produkter"
		));
		translationsRepository.save(new Translations(
				"sv",
				"subscribe",
				"Prenumerera"
		));
	}

}
