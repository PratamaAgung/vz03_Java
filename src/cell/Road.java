package cell;

public class Road extends Facility{
	private final int jenis;
	
	/**
	 * Konstruktor dengan 2 parameter, untuk jenis jalan biasa
	 * @param _absis lokasi absis dari Road
	 * @param _ordinat lokasi Ordinat dari Road
	 */
	public Road(int _absis, int _ordinat) {
		super(' ', _absis, _ordinat);
		jenis=0;
	}
	
	/**
	 * Konstruktor dengan 3 parameter, untuk jenis entrance dan exit
	 * @param _jenis menyatakan jenis dari Road
	 * @param _absis lokasi absis dari Road
	 * @param _ordinat lokasi ordinat dari Road
	 */
	public Road(int _jenis, int _absis, int _ordinat) {
		super(' ', _absis, _ordinat);
		jenis=_jenis;
	}
	
	/**
	 * Getter dari data member jenis
	 * @return integer yang melambangkan jenis dari Road
	 */
	public int getJenis() {
		return jenis;
	}
	
	/**
	 * Method untuk mencetak road ke layar
	 */
	public void render() {
		System.out.print("\u001B[32m"+type+"\u001B[0m");
	}
}
