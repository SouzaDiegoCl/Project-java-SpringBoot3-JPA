package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Order;

@Repository //Não precisa porque ele herda o JpaRepository e atuomaticamente registra o componente Repository como repository
public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
