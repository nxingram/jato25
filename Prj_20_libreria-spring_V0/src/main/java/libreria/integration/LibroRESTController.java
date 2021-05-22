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
public class LibroRESTController {

	@Autowired
	LibroService _service;
	
	@GetMapping("/libri")
	public List<Libro> getAll(){
		return _service.getLibri();
	}
	
	@GetMapping("/librispagnolo")
	public List<Libro> getAlls(){
		return _service.getLibri();
		
	}
	
}
