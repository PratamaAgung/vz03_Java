package cell;
 
/**
  * Kelas yang mewakili habitat air 
  * @author pratamaagung
  *
  */
public class WaterHabitat extends Habitat{
	
	/**
	 * Konstruktor kelas WaterHabitat
	 * @param _absis lokasi absis dari WaterHabitat
	 * @param _ordinat lokasi ordinat dari kelas WaterHabitat
	 */
	public WaterHabitat(int _absis, int _ordinat) {
		super('w', _absis, _ordinat);
	}
}
