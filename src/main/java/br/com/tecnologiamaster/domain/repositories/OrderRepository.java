package br.com.tecnologiamaster.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecnologiamaster.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
