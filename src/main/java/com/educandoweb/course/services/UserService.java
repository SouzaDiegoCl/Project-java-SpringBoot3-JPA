package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

//Anotation para registrar classe no spring como service, poderia ser Component ou Repository
@Service
public class UserService {

	@Autowired // Injeção de dependência automática do spring
	private UserRepository repository; 
	
	public List<User> findAll(){//Função da camada de serviço que repassa a chamada para o repository.findAll() 
		return repository.findAll();
	}
	
	public User insert(User obj) {
		return repository.save(obj);//metodo save ja retorna objeto salvo
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
