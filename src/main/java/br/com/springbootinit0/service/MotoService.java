package br.com.springbootinit0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springbootinit0.model.Moto;
import br.com.springbootinit0.repository.MotoRepository;

@Service
public class MotoService {

	@Autowired
	MotoRepository motoRepository;
	
	public List<Moto> findAll(){
		return motoRepository.findAll();				
	}
	
	public Moto save(Moto moto){
		return motoRepository.save(moto);
	}
}
