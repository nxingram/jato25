package db;

import java.sql.SQLException;
import java.util.List;

import model.Editore;

public interface IEditoreDAO {

	String GET_ONE = "select from editore where id=?";
	String GET_ALL = "select * from editore";
	String INSERT = "insert into editore(nome) value(?)";
	String UPDATE = "update editore set nome=? where id=?";
	String DELETE = "delete from editore where id=?";
	
	Editore getEditore(int id) throws SQLException;
	List<Editore> getEditori() throws SQLException;
	void addEditore(Editore l) throws SQLException;
	void updateEditore(Editore l) throws SQLException;
	void deleteEditore(Editore l) throws SQLException;
}
