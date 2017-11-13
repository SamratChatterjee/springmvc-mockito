package com.teksystems.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.teksystems.model.ToDo;
import com.teksystems.repository.ToDoRepository;

@SpringBootApplication(scanBasePackages= {"com.teksystems.*"})
@ComponentScan({"com.teksystems.*"})
@EnableJpaRepositories(basePackageClasses=ToDoRepository.class)
@EntityScan({"com.teksystems.*"})
public class App {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public CommandLineRunner setup(ToDoRepository toDoRepository) {
		return (args) -> {
			toDoRepository.save(new ToDo(1,"Remove unused imports", true));
			toDoRepository.save(new ToDo(2,"Clean the code", true));
			toDoRepository.save(new ToDo(3,"Build the artifacts", false));
			toDoRepository.save(new ToDo(4,"Deploy the jar file", true));
			//logger.info("The sample data has been generated");
		};
	}	
}
