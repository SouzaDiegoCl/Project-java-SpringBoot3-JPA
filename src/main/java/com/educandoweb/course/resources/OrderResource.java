package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired //Resource dependendo do services
	private OrderService service;
	
	//Controlador Rest que responde no caminho /Orders 
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		 List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
		// .ok para retornar a resposta com sucesso no http e o .body retornar o Order 'u' no corpo 	
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
