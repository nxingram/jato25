package libreria.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import libreria.entities.Libro;
import libreria.services.LibroService;

@RestController
@RequestMapping("/rest")
public class Libri {

	@Autowired
	private LibroService ls;
	
	@GetMapping("/libri")
	public List<Libro> getAll(){
		return ls.getLibri();
	}
	
	@GetMapping("/libros")
	public List<Libro> getAlls(){
		return ls.getLibri();
	}	
}
