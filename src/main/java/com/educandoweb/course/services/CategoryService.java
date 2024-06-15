package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

//Anotation para registrar classe no spring como service, poderia ser Component ou Repository
@Service
public class CategoryService {

	@Autowired // Injeção de dependência automatica do spring
	private CategoryRepository repository; 
	
	public List<Category> findAll(){//Função da camada de serviço que repassa a chamada para o repository.findAll() 
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
