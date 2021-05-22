package libreria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import libreria.entities.Libro;
import libreria.repos.LibroIDAO;

@Service
public class LibroService implements LibroIService {

	@Autowired
	private LibroIDAO db;//IOC
	
	
	@Override
	public void addLibro(Libro l) {
		db.save(l);
	}

	@Override
	public List<Libro> getLibri() {
		return db.findAll();
	}

	@Override
	public Libro getLibro(int id) {
		return db.getOne(id);
	}

	@Override
	public void updateLibro(Libro l) {
		db.save(l);
	}

	@Override
	public void deleteLibro(int id) {
		db.deleteById(id);
	}

}
