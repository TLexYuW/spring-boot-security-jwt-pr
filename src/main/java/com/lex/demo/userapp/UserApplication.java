package com.lex.demo.userapp;

import com.lex.demo.userapp.model.Role;
import com.lex.demo.userapp.model.User;
import com.lex.demo.userapp.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	// run after Application initialize
//	@Bean
//	CommandLineRunner runner(UserService userService){
//		return  args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null, "John", "john@gmail.com", "12345", new ArrayList<>()));
//			userService.saveUser(new User(null, "Will", "will@gmail.com", "12345", new ArrayList<>()));
//			userService.saveUser(new User(null, "Alex", "alex@gmail.com", "12345", new ArrayList<>()));
//			userService.saveUser(new User(null, "Barry", "barry@gmail.com", "12345", new ArrayList<>()));
//
//			userService.addRoleToUser("john@gmail.com", "ROLE_USER");
//			userService.addRoleToUser("john@gmail.com", "ROLE_MANAGER");
//			userService.addRoleToUser("will@gmail.com", "ROLE_MANAGER");
//			userService.addRoleToUser("alex@gmail.com", "ROLE_ADMIN");
//			userService.addRoleToUser("barry@gmail.com", "ROLE_USER");
//			userService.addRoleToUser("barry@gmail.com", "ROLE_ADMIN");
//			userService.addRoleToUser("barry@gmail.com", "ROLE_SUPER_ADMIN");
//		};
//	}
}
