package br.com.app.services;

public class PokemonNotFound extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public PokemonNotFound(String message) {
		super(message);
	}

}
