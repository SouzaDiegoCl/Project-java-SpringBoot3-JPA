package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//Controlador Rest que responde no caminho /users 
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "123", "12345");
		return ResponseEntity.ok().body(u);
		// .ok para retornar a resposta com sucesso no http e o .body retornar o User 'u' no corpo 
		
		
	}
	
	
}
