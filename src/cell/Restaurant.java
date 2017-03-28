package cell;

public class Restaurant extends Facility{
	
	/**
	 * Konstruktor
	 * @param _absis lokasi absis dari Restaurant
	 * @param _ordinat lokasi ordinat dari Restaurant
	 */
	public Restaurant(int _absis, int _ordinat) {
		super('R', _absis, _ordinat);
	}
	
	/**
	 * Method untuk mencetak restaurant ke layar
	 */
	public void render() {
		System.out.print("\u001B[34m"+ type+ "\u001B[0m");
	}
}
