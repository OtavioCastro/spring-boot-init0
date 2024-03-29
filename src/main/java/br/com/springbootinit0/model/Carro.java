package br.com.springbootinit0.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Carro {

	//Atributos/Colunas ------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String marca;
	private String modelo;
	private int ano;
	private float preco;
	
	@ElementCollection
	private List<Carro> carros;

	
	//Construtores ------------------------	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Carro(String marca, String modelo, int ano, float preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}


	//Getters e Setters ------------------------	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

}
