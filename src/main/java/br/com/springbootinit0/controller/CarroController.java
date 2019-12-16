package br.com.springbootinit0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.springbootinit0.model.Carro;
import br.com.springbootinit0.service.CarroService;

@Controller
public class CarroController {

	@Autowired
	private CarroService carroService;
			
	@GetMapping("/formCarro")
	public String teste() {
		return "formCarro";
	}
	
	@PostMapping("/formCarro")
	public String addCarro(@RequestParam("marca") String marca, 
			@RequestParam("modelo") String modelo, @RequestParam("ano") int ano,
			@RequestParam("preco") float preco) {
		
		Carro novoCarro = new Carro();
		novoCarro.setMarca(marca);
		novoCarro.setModelo(modelo);
		novoCarro.setAno(ano);
		novoCarro.setPreco(preco);
		
		this.carroService.save(novoCarro);
		
		return "redirect:listaCarros";
	}
	
	@RequestMapping("/listaCarros")
	public String listaCarros(Model model) {
		model.addAttribute("carrosList", this.carroService.findAll());
		
		return "listaCarros";
	}
	
}
