package libreria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import libreria.entities.Libro;
import libreria.repos.ILibroDAO;

@Service
public class LibroService implements ILibroService {

	@Autowired
	private ILibroDAO _db;//IOC
	

	@Override
	public void addLibro(Libro l) {
		_db.save(l);
	}

	@Override
	public List<Libro> getLibri() {
		return _db.findAll();
	}

	@Override
	public Libro getLibro(int id) {
		return _db.getOne(id);
	}

	@Override
	public void updateLibro(Libro l) {
		_db.save(l);
	}

	@Override
	public void deleteLibro(int id) {
		_db.deleteById(id);
	}

}
