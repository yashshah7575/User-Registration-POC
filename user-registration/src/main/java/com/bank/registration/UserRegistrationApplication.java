package com.bank.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bank.registration.entity",
				"com.bank.registration.dto",
				"com.bank.registration.constants",
				"com.bank.registration",
				"com.bank.registration.controller",
				"com.bank.registration.repository",
				"com.bank.registration.service"})
@EntityScan(basePackages = {"com.bank.registration.entity"})
public class UserRegistrationApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}
}
