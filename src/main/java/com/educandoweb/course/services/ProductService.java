package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

//Anotation para registrar classe no spring como service, poderia ser Component ou Repository
@Service
public class ProductService {

	@Autowired // Injeção de dependência automática do spring
	private ProductRepository repository; 
	
	public List<Product> findAll(){//Função da camada de serviço que repassa a chamada para o repository.findAll() 
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
