package br.com.tecnologiamaster.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecnologiamaster.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
