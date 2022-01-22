package br.co.devfamilia.jogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.co.devfamilia.jogos.entity.Jogo;
import br.co.devfamilia.jogos.service.JogoService;

@RestController
public class JogoController {
	
	@Autowired
	private JogoService jogoService;
	
	@PostMapping
	public ResponseEntity<Jogo> createJogo(@RequestBody Jogo jogo){
		return new ResponseEntity<Jogo>(jogoService.createJogo(jogo), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Jogo>> getAll(){
		return new ResponseEntity<List<Jogo>>(jogoService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "{" + "id" + "}")
	public ResponseEntity<Jogo> getById(@PathVariable Integer id){
		return new ResponseEntity<Jogo>(jogoService.getById(id), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Jogo> updateJogo(@RequestBody Jogo jogo){
		return new ResponseEntity<Jogo>(jogoService.updateJogo(jogo), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "{" + "id" + "}")
    @ResponseStatus(value = HttpStatus.OK)
	public void deleteById(@PathVariable Integer id){
		jogoService.deleteById(id);
	}

}
