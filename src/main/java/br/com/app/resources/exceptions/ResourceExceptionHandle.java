package br.com.app.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import br.com.app.services.PokemonNotFound;

@ControllerAdvice
public class ResourceExceptionHandle {

	@ExceptionHandler(PokemonNotFound.class)
	public ResponseEntity<StandardError> pokemonNotFound(PokemonNotFound e, HttpServletRequest request){
		
		StandardError error = new StandardError();
		error.setTimestamp(System.currentTimeMillis());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setError("Not found.");
		error.setMessage(e.getMessage());
		error.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);		
	}
	
}
