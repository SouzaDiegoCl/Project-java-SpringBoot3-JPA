package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.pk.OrderItemPk;

@Repository //Não precisa porque ele herda o JpaRepository e atuomaticamente registra o componente Repository como repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

	
}
