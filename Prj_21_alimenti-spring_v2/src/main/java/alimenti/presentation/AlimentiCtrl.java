package alimenti.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import alimenti.entities.Alimento;
import alimenti.service.AlimentoIService;

@Controller
@RequestMapping("/admin")
public class AlimentiCtrl {

	@Autowired
	private AlimentoIService service;
	
	@GetMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("chiave", "valore");
		return "index";		
	}
	
	@GetMapping(value = "products/{id}")
//	public String home(@PathVariable("id") int id, Model model) {
	public ModelAndView home(@PathVariable("id") int id) {
		Alimento alimento = service.getProduct(id);
//		model.addAttribute("alimento", alimento);
		return new ModelAndView("dettaglio", "alimento", alimento);
	}
	
	@GetMapping(value = "categories")
	public ModelAndView getCategories() {
		return new ModelAndView("categorie", "categorie", service.getCategories());
	}
	
	@GetMapping(value = "/add")
	public String formInserimento() {
		return "addAlimento";
	}
	
	@PostMapping(value = "/addProduct")
	public String addProduct(@ModelAttribute("alimento") Alimento alimento) {
		Alimento newAlimento = service.addProduct(alimento);
		return "redirect:/admin/products/" + newAlimento.getId();
	}

	@GetMapping(value = "/update/{id}")
	public ModelAndView formModifica(@PathVariable int id) {
		return new ModelAndView("updAlimento", "alimento", service.getProduct(id));
	}
	
	@PostMapping(value  = "/updProduct")
	public String updProduct(@ModelAttribute("alimento") Alimento alimento) {
		Alimento newAlimento = service.updProduct(alimento);
		return "redirect:/admin/products/" + newAlimento.getId();
	}
}
	
