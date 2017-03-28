package cell;

public abstract class Habitat extends Cell{
	
	/**
	 * Konstruktor kelas Cell
	 * @param type karakter simbol dari cell
	 * @param _absis lokasi absis dari cell
	 * @param _ordinat lokasi ordinat dari cell
	 */
	public Habitat (char type, int _absis, int _ordinat) {
		super(type, _absis, _ordinat);
	}
	
	/**
	 * Method untuk mencetak habitat ke layar
	 */
	public void render() {
		if (animal!=null) {
			
		}
		else {
			if(cage!=null) {
				System.out.print((char) type-32); 
			}
			else {
				System.out.print(type);
			}
		}
	}
}
