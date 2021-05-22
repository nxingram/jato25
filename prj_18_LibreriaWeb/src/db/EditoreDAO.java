package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Editore;

public class EditoreDAO implements IEditoreDAO {

	private Connection con; // java.sql.Connection
	private Statement statement; // java.sql.Statement
	private ResultSet rs; // java.sql.ResultSet

	private Connessione c = new Connessione();

	@Override
	public Editore getEditore(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Editore> getEditori() throws SQLException {
		ArrayList<Editore> editori = new ArrayList<>();
		rs = c.connetti().prepareStatement(GET_ALL).executeQuery();

		while(rs.next()) {
			Editore e = new Editore();
			e.setNome(rs.getString("nome"));
			editori.add(e);
		}
		return editori;
	}

	@Override
	public void addEditore(Editore l) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEditore(Editore l) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEditore(Editore l) throws SQLException {
		// TODO Auto-generated method stub

	}

}
