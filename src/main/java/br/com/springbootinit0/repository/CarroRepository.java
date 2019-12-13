package br.com.springbootinit0.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springbootinit0.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer> {

}
