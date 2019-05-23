package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.Cliente;
import repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Cliente> listar(){
		Iterable<Cliente> lista =repository.findAll();
		return lista;
	}
	
	@PostMapping
	public Cliente inserir(@RequestBody @Valid Cliente cliente) {
		return repository.save(cliente);
		
	}
	
	@DeleteMapping
	public Cliente excluir(@RequestBody Cliente cliente) {
		repository.delete(cliente);
		return cliente;
	}
}
