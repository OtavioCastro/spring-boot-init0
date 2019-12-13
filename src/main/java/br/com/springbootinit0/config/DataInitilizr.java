package br.com.springbootinit0.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.springbootinit0.model.Carro;
import br.com.springbootinit0.repository.CarroRepository;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	CarroRepository carroRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<Carro> carros = carroRepository.findAll();
		
		if(carros.isEmpty()) {
		
		Carro carro = new Carro();
		
		carro.setMarca("Porsche");
		carro.setModelo("911");
		carro.setAno(2012);
		carro.setPreco(2300000);
		
		carroRepository.save(carro);
		
		}
	}

}
