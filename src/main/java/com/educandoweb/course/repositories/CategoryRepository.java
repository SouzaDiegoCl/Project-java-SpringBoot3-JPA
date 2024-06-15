package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.User;

@Repository //Não precisa porque ele herda o JpaRepository e atuomaticamente registra o componente Repository como repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
