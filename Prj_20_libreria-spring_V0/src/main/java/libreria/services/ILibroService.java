package libreria.services;

import java.util.List;

import libreria.entities.Libro;


public interface ILibroService {

	void addLibro(Libro l);//C
	List<Libro> getLibri();//R
	Libro getLibro(int id);
	void updateLibro(Libro l);//U
	void deleteLibro(int id);//D
}
