package br.com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.app.entities.Pokemon;
import br.com.app.repositories.PokemonRepository;

@Service
public class PokemonService {

	@Autowired
	PokemonRepository repository;
	
	public List<Pokemon> listAllPokemons() {
		return this.repository.findAll();
	}
	
	
	public Pokemon addPokemon(Pokemon obj) {
		return this.repository.save(obj);
	}
	
	
}
