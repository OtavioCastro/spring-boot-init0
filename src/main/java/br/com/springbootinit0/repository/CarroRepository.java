package br.com.springbootinit0.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.springbootinit0.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer> {

	//Queries para buscar o registro
	Carro findByMarca(String marca);
	Carro findByModelo(String modelo);
	Carro findByAno(int ano);
	Carro findByPreco(float preco);
	
	//Query personalizada (Versão em lista)
	@Query("select x from Carro x where x.preco > ?1")
	List<Carro> findMaiorQueX(float preco);
}
