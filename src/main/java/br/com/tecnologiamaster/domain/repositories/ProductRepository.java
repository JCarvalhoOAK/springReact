package br.com.tecnologiamaster.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecnologiamaster.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
