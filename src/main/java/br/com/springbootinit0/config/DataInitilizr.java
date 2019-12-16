package br.com.springbootinit0.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import br.com.springbootinit0.model.Carro;
import br.com.springbootinit0.repository.CarroRepository;

@Component
public class DataInitilizr { //implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	CarroRepository carroRepository;

	/*
	 * @Override public void onApplicationEvent(ContextRefreshedEvent event) {
	 * 
	 * 
	 * List<Carro> carros = carroRepository.findAll();
	 * 
	 * if(carros.isEmpty()) {
	 * 
	 * 
	 * Carro carro = new Carro();
	 * 
	 * carro.setMarca("Porsche"); carro.setModelo("911"); carro.setAno(2012);
	 * carro.setPreco(2300000);
	 * 
	 * carroRepository.save(carro);
	 * 
	 * 
	 * createCarro("Fiat", "Uno Mille", 94, 8000); createCarro("Ford", "Ka", 2012,
	 * 19000); createCarro("Citroen", "C4", 2010, 22000); createCarro("Honda",
	 * "HRV", 2018, 85000);
	 * 
	 * 
	 * }
	 * 
	 * 
	 * Carro carro = carroRepository.findByMarca("FORD");
	 * System.out.println("Carro escolhido: " + carro.getMarca() + " " +
	 * carro.getModelo());
	 * 
	 * // List<Carro> carro2 = (List<Carro>) carroRepository.findMaiorQueX(60000);
	 * // System.out.println("Carro Mais caro: " + carro2.get(0).getMarca() + " " +
	 * // carro2.get(0).getModelo());
	 * 
	 * }
	 * 
	 * public void createCarro(String marca, String modelo, int ano, float preco) {
	 * Carro carro = new Carro(marca, modelo, ano, preco);
	 * 
	 * carroRepository.save(carro); }
	 */
}
