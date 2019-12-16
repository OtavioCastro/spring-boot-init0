package br.com.springbootinit0.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.springbootinit0.model.Moto;

public interface MotoRepository extends JpaRepository<Moto, Integer> {
	
	//Queries para buscar o registro	
	Moto findByMarca(String marca);
	Moto findByModelo(String modelo);
	Moto findByAno(int ano);
	Moto findByPreco(float preco);
	
	//Query personalizada (Versão em lista)
	@Query("select x from Carro x where x.preco > ?1")
	List<Moto> findMaiorQueX(float preco);	

}
