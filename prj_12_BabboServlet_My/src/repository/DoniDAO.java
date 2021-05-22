package repository;

import java.util.ArrayList;

import model.Dono;

public class DoniDAO {

	private ArrayList<Dono> _listaDoni;
	
	public DoniDAO() {
		_listaDoni = new ArrayList<Dono>();
		init();
	}
	
	private void init() {
		_listaDoni.add(new Dono("Trenino elettrico"));
		_listaDoni.add(new Dono("Robot"));
		_listaDoni.add(new Dono("Bambola"));
		_listaDoni.add(new Dono("Gioco società"));
	}
	
	public ArrayList<Dono> getDoni() {
		return _listaDoni;
	}
}
