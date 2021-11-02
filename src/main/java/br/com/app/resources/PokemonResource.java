package br.com.app.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.entities.Pokemon;
import br.com.app.services.PokemonService;

@RestController
@RequestMapping(value = "/")
public class PokemonResource {

	@Autowired
	PokemonService service;
	
	
	@PostMapping(value = "/pokemons")
	public ResponseEntity registerPokemon(@RequestBody Pokemon pokemon) {
		return ResponseEntity.ok().body(this.service.register(pokemon));
	}
	
	@GetMapping(value = "/pokemons")
	public ResponseEntity<List<Pokemon>> listPokemons() {
		return ResponseEntity.ok().body(this.service.findAll());
	}
	
	@GetMapping(value = "/pokemons/{id}")
	public ResponseEntity getPokemon(@PathVariable(name = "id") Integer id) {		
		return ResponseEntity.ok().body(this.service.findById(id));
	}
	
	
	
	
	
}
