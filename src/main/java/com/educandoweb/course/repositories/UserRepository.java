package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
=======
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.User;

@Repository //Não precisa porque ele herda o JpaRepository e atuomaticamente registra o componente Repository como repository
public interface UserRepository extends JpaRepository<User, Long>{

	
>>>>>>> 474ef0274622f1c218fdc3e3cfab6fd227272774
}
