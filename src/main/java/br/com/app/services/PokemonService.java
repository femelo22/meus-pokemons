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
	
	public Pokemon register(Pokemon obj) {
		return this.repository.save(obj);
	}
	
	
	public List<Pokemon> findAll() {
		return this.repository.findAll();
	}
	
	public Pokemon findById(Integer id) {
		return this.repository.findById(id)
				.orElseThrow(() -> new PokemonNotFound("Pokemon not found."));
	}
	
	public Pokemon update(Integer id, Pokemon pokemon) {
		pokemon.setId(id);
		return this.repository.save(pokemon);
	}
	
	public void delete(Integer id) {
		this.repository.deleteById(id);
	}
	
}
