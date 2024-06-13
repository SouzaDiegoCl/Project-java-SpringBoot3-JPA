package com.educandoweb.course.config;

<<<<<<< HEAD
=======
import java.util.Arrays;

>>>>>>> 474ef0274622f1c218fdc3e3cfab6fd227272774
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
<<<<<<< HEAD
		
	@Autowired
=======

	@Autowired // Spring resolve a dependencia e associa instancia de userRepository dentro!
>>>>>>> 474ef0274622f1c218fdc3e3cfab6fd227272774
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
<<<<<<< HEAD
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");		
	}
	
=======

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
	
		
		//Objeto repository que acessa os dados:
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	
	
	
>>>>>>> 474ef0274622f1c218fdc3e3cfab6fd227272774
}
