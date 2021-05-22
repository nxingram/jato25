package libreria.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import libreria.services.LibroService;

@Controller
public class LibriCtrl {

	@Autowired
	private LibroService ls;
	
	
	@RequestMapping("/libri")
	private String getLibri(Model model) {
		//System.out.println("booh!");
		
		model.addAttribute("libri", ls.getLibri());
		
		return "elenco_libri";	
		}
	
}
