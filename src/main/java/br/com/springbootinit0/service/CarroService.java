package br.com.springbootinit0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springbootinit0.model.Carro;
import br.com.springbootinit0.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	CarroRepository carroRepository;
	
	public List<Carro> findAll(){
		return carroRepository.findAll();				
	}
	
	public Carro save(Carro carro) {
		return carroRepository.save(carro);
	}
}
