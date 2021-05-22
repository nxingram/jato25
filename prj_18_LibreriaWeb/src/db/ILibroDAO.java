package db;

import java.sql.SQLException;
import java.util.List;

import model.Libro;

public interface ILibroDAO {

	// proprietà,attributi sono implicitamente
	// ->> Public Static Final
	String FIND_ALL = "select * from libro";
	
	// metodi sono implicitamente public abstract
	Libro getLibro(int id) throws SQLException;
	List<Libro> getLibri() throws SQLException;
	void addLibro(Libro l) throws SQLException;
	void deleteLibro(Libro l) throws SQLException;
	void updateLibro(Libro l) throws SQLException;
}
