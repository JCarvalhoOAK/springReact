package br.com.tecnologiamaster.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecnologiamaster.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}