package cell;

public abstract class Facility extends Cell{
	
	/**
	 * Konstruktor kelas facility
	 * @param c type dari facility
	 * @param _absis lokasi absis dari facility
	 * @param _ordinat lokasi ordinat dari facility
	 */
	public Facility(char c, int _absis, int _ordinat){
		super(c, _absis, _ordinat);
	}
}
