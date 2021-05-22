package libreria.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(path = "/libri/{id}", method = RequestMethod.GET)
	private String getLibro(@PathVariable("id") int id, Model model) {
		//aggiungo il libro al model
		model.addAttribute("libro", ls.getLibro(id));
		
		return "dettaglio";
	}
	
	@RequestMapping(path = "/libri/delete?id={id}",method = RequestMethod.GET)
	private String deleteLibro(@PathVariable("id") int id, Model model) {
		
//		return "eliminato";	
		return "redirect:/libri";
	}
	
	
}
