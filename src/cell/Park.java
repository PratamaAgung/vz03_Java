package cell;

public class Park extends Facility {
	
	/**
	 * Konstruktor
	 * @param _absis lokasi absis dari Park
	 * @param _ordinat lokasi ordinat dari park
	 */
	public Park(int _absis, int _ordinat) {
		super('*', _absis, _ordinat);
	}
	
	/**
	 * Method untuk mencetak park ke layar
	 */
	public void render() {
		System.out.print("\u001B[34m" + type + "\u001B[0m");
	}
}
