package cell;

/**
 * Kelas yang merepresentasikan habitat udara
 * @author pratamaagung
 *
 */
public class AirHabitat extends Habitat{
	
	/**
	 * Konstruktor kelas AirHabitat
	 * @param _absis lokasi absis dari AirHabitat
	 * @param _ordinat lokasi ordinat dari AirHabitat
	 */
	public AirHabitat(int _absis, int _ordinat) {
		super('o', _absis, _ordinat);
	}
}
