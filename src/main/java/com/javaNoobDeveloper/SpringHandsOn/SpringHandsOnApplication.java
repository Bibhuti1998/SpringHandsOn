package com.javaNoobDeveloper.SpringHandsOn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javaNoobDeveloper.SpringHandsOn.dao.UserRepository;
import com.javaNoobDeveloper.SpringHandsOn.entities.User;

@SpringBootApplication
public class SpringHandsOnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHandsOnApplication.class, args);
		
	}

}
