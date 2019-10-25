package com.javahelps.restservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javahelps.restservice.repository.UserRepository;
import com.javahelps.restservice.entity.User;

@SpringBootApplication
public class Application {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    protected CommandLineRunner init(final UserRepository userRepository) {

        return args -> {
            User user = new User();
            user.setUsername("admin");
            user.setPassword("admin");
            user.setName("Administrator");
            user.setEmail("admin@javahelps.com");
            userRepository.save(user);

        };
    }
}