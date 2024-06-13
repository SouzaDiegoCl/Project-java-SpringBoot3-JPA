package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

//Anotation para registrar classe no spring como service, poderia ser Component ou Repository
@Service
public class OrderService {

	@Autowired // Injeção de dependência automática do spring
	private OrderRepository repository; 
	
	public List<Order> findAll(){//Função da camada de serviço que repassa a chamada para o repository.findAll() 
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
