package br.com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app.entities.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{

}
