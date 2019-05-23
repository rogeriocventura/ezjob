package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.Servico;
import repository.ServicoRepository;

@RestController
@RequestMapping("/servico")
public class ServicoController {
	
	@Autowired
	private ServicoRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Servico> listar(){
		Iterable<Servico> lista =repository.findAll();
		return lista;
	}
	
	@PostMapping
	public Servico inserir(@RequestBody @Valid Servico servico) {
		return repository.save(servico);
		
	}
	
	@DeleteMapping
	public Servico excluir(@RequestBody Servico servico) {
		repository.delete(servico);
		return servico;
	}
}
