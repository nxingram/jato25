package libreria.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import libreria.entities.Libro;
import libreria.repos.LibroIDAO;

@Service
public class LibroService implements LibroIService {

	@Autowired
	private LibroIDAO db;//IOC
	
	
	@Override
	public Libro addLibro(Libro l) {
		return db.save(l);
	}

	@Override
	public List<Libro> getLibri() {
		return db.findAll();
	}

	@Override
	public Libro getLibro(int id) throws NoSuchElementException{
		try {
			return db.findById(id).get();
		} catch (NoSuchElementException e) {
			throw e;
		}
	}

	@Override
	public Libro updateLibro(Libro l) {
		try {
			this.getLibro(l.getId());
		} catch (Exception e) {
			return new Libro();
		}
		return db.save(l);
	}


	@Override
	public void deleteLibro(int id) {
		db.deleteById(id);
	}

	

}
