package libreria.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import libreria.services.LibroService;

@Controller
public class LibroControllerMVC {

	@Autowired
	private LibroService _service;
	
	
	@RequestMapping("/libri")
		private String getLibri(Model model) {
		
		// pom -> jstl dependency
		model.addAttribute("libri", _service.getLibri());
		return "elenco_libri"; // nome della jsp
	}
}
