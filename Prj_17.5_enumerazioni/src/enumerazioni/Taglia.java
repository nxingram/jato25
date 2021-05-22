package enumerazioni;

public enum Taglia {

	// proprietà enum ->> sono oggetti!!!
	S(40), M(44), L(48), XL(52);
	
	private int taglia;

	/**
	 * costruttore privato : assegna valore taglia alle singole proprietà 
	 * enum assomiglia a Singleton
	 * @param taglia
	 */
	private Taglia(int taglia) {
		this.taglia = taglia;
	}

	/**
	 * get calssico
	 * @return int
	 */
	public int getTaglia() {
		return taglia;
	}	
	
	/**
	 *  trasformo il get int ->> in un toString!!!
	 * @return String
	 */
	public String getTagliaToString() {
		return " la taglia " + this + " " + taglia;
	}
	
}
