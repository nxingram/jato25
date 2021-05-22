package com.example.alimenti.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.alimenti.entities.Alimento;
import com.example.alimenti.services.IAlimentiService;


@RestController
@RequestMapping("/api")
public class AlimentiRestCtrl {
	@Autowired
	private IAlimentiService srv;
	
	@GetMapping(value  = "/alimenti", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Alimento> getAlimenti(){
		return srv.getAlimenti();
	}
	
	@GetMapping(value = "/alimenti/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Alimento getAlimentiById(@PathVariable int id) {
		return srv.getAlimenti(id);
	}
	
	@PostMapping(value = "/alimenti",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Alimento addAlimenti(@RequestBody Alimento al) {
		return srv.addAlimenti(al);
	}

	@PutMapping(value = "/alimenti",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Alimento updateAlimenti(@RequestBody Alimento al) {
		return srv.updateAlimenti(al);
	}
	
	@DeleteMapping(value ="/alimenti/{id}")
	public void deleAlimentiById(@PathVariable int id) {
		srv.deleteAlimenti(id);
	}
}
