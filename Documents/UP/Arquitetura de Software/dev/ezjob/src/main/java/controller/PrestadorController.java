package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.Prestador;
import repository.PrestadorRepository;

@RestController
@RequestMapping("/prestador")
public class PrestadorController {
	
	@Autowired
	private PrestadorRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Prestador> listar(){
		Iterable<Prestador> lista =repository.findAll();
		return lista;
	}
	
	@PostMapping
	public Prestador inserir(@RequestBody @Valid Prestador prestador) {
		return repository.save(prestador);
		
	}
	
	@DeleteMapping
	public Prestador excluir(@RequestBody Prestador prestador) {
		repository.delete(prestador);
		return prestador;
	}
}
