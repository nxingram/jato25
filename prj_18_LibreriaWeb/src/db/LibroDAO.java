package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Libro;

public class LibroDAO implements ILibroDAO {

	private Connection con; // java.sql.Connection
	private Statement statement; // java.sql.Statement
	private ResultSet rs; // java.sql.ResultSet

	private Connessione c = new Connessione();

	private void connect() {
		if (con == null)
			this.con = this.c.connetti();
	}

	/**
	 * metodo è riconosciuto come 1 override, nonostante abbiamo aggiunto implements
	 * ILibroDAO dopo aver scritto i metodi\
	 */
	public Libro getLibro(int id) {
		Libro l = null;
//		this.con = this.c.connetti();
		this.connect();

		try {
			this.statement = con.createStatement();
			this.rs = this.statement.executeQuery("select * from libro where id='" + id + "';");
			this.rs.next();

			l = new Libro();
			l.setId(rs.getInt("id"));
			l.setTitolo(rs.getString("titolo"));
			l.setPrezzo(rs.getDouble("prezzo"));
			l.setP_iva(rs.getDouble("p_iva"));
			l.setPagine(rs.getInt("pagine"));
			l.setEditore_id(rs.getInt("editore_id"));
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return l;
	}

	public ArrayList<Libro> getLibri() {
//		this.con = this.c.connetti();
		this.connect();
		ArrayList<Libro> libri = new ArrayList<Libro>();

		try {
			this.statement = con.createStatement();
//			this.rs = this.statement.executeQuery("select * from libro;");
			this.rs = this.statement.executeQuery(FIND_ALL);

			Libro l = null;
			while (rs.next()) {
				l = new Libro();
				l.setId(rs.getInt("id"));
				l.setTitolo(rs.getString("titolo"));
				l.setPrezzo(rs.getDouble("prezzo"));
				l.setP_iva(rs.getDouble("p_iva"));
				l.setPagine(rs.getInt("pagine"));
				l.setEditore_id(rs.getInt("editore_id"));
				libri.add(l);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libri;
	}

//	public static void main(String[] args) {
//		LibroDAO ld = new LibroDAO();
//		Libro l = ld.getLibro(1);
////		System.out.println(l.getTitolo());
//
//		ArrayList<Libro> libri = ld.getLibri();
//		for (Libro libro : libri) {
//			System.out.println(libro);
//		}
//	}

	@Override
	public void addLibro(Libro l) throws SQLException {
		this.connect();
		Statement statement = con.createStatement();
//		this.statement.executeUpdate("insert into libro(titolo,prezzo,p_iva,pagine,editore_id) "
//				+ "values("
//				+ "'" + l.getTitolo() + "',"
//				+ l.getPrezzo() + ","
//				+ l.getP_iva() + ","
//				+ l.getPagine() + ","
//				+ l.getEditore_id() + ","
//				+")");
		
		PreparedStatement ps = this.con.prepareStatement(
				"insert into libro(titolo,prezzo,p_iva,pagine,editore_id) "
				+ " values(?,?,?,?,?)");
		
		ps.setString(1, l.getTitolo());
		ps.setDouble(2, l.getPrezzo());
		ps.setDouble(3, l.getP_iva());
		ps.setInt(4, l.getPagine());
		ps.setInt(5, l.getEditore_id());
		ps.executeUpdate();
		
		
	}

	@Override
	public void deleteLibro(Libro l) throws SQLException {
		this.connect();
		Statement st = con.createStatement();
		st.executeUpdate("delete ftom libro where id="+ l.getId());
	}

	@Override
	public void updateLibro(Libro l) throws SQLException {
		this.connect();
		
		PreparedStatement ps = this.con.prepareStatement(
				"update libro "
				+ "set titolo =?, prezzo =?, p_iva =?, "
				+ "pagine =?, editore_id =? "
				+ "where id=?");
		
		ps.setString(1, l.getTitolo());
		ps.setDouble(2, l.getPrezzo());
		ps.setDouble(3, l.getP_iva());
		ps.setInt(4, l.getPagine());
		ps.setInt(5, l.getEditore_id());
		ps.setInt(6, l.getId());
		ps.executeUpdate();
	}

}
