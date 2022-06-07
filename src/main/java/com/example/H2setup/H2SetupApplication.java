package com.example.H2setup;

import com.example.H2setup.model.Person;
import com.example.H2setup.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class H2SetupApplication
{

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=
		SpringApplication.run(H2SetupApplication.class, args);
		PersonRepository personRepository=configurableApplicationContext.getBean(PersonRepository.class);
		Person myPerson = new Person("Ram", "Kumar");
		personRepository.save(myPerson);


	}

}
