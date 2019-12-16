package br.com.springbootinit0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.springbootinit0.model.Moto;
import br.com.springbootinit0.repository.MotoRepository;

@Controller
public class MotoController {

	@Autowired
	MotoRepository motoRepository;
	
	@GetMapping("/formMoto")
	public String teste() {
		return "formMoto";
	}
	
	@PostMapping("/formMoto")
	public String addCarro(@RequestParam("marca") String marca, 
			@RequestParam("modelo") String modelo, @RequestParam("ano") int ano,
			@RequestParam("preco") float preco) {
		
		Moto novaMoto = new Moto();
		novaMoto.setMarca(marca);
		novaMoto.setModelo(modelo);
		novaMoto.setAno(ano);
		novaMoto.setPreco(preco);
		
		this.motoRepository.save(novaMoto);
		
		return "redirect:listaMotos";
	}
	
	@RequestMapping("/listaMotos")
	public String listaCarros(Model model) {
		model.addAttribute("motosList", this.motoRepository.findAll());
		
		return "listaMotos";
	}

}
