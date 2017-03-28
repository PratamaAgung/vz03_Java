package cell;
import renderable.*;

public abstract class Cell implements Renderable{
	protected int cage;
	protected int animal;
	protected final char type;
	protected final int absis;
	protected final int ordinat;
	
	/**
	 * Konstruktor
	 * @param c type dari cell
	 * @param _absis lokasi absis dari cell
	 * @param _ordinat lokasi ordinat dari cell
	 */
	public Cell(char c, int _absis, int _ordinat) {
		type=c;
		absis=_absis;
		ordinat=_ordinat;
		cage= 0;
		animal= 0;
	}
	
	/**
	 * Getter dari data atribut type
	 * @return type dari cell
	 */
	public char getType() {
		return type;
	}
	
	/**
	 * Getter dari data atribut cage
	 * @return cage yang melingkupi cell
	 */
	public int getCage() {
		return cage;
	}
	
	/**
	 * Setter dari data aribut cage
	 * @param _cage cage yang melingkupi cell
	 */
	public void setCage(int _cage) {
		cage=_cage;
	}
	
	/**
	 * Getter dari data atribut animal
	 * @return animal yang berada pada cell
	 */
	public int getAnimal() {
		return animal;
	}
	
	/**
	 * Setter dari data atribut animal
	 * @param _animal animal yang berada pada cell
	 */
	public void setAnimal(int _animal) {
		animal=_animal;
	}
	
	/**
	 * Penghapus dari keberadaan animal pada suatu cell
	 */
	public void eraseAnimal() {
		animal=0;
	}
	
	/**
	 * Getter dari data atribut absis
	 * @return lokasi absis dari cell
	 */
	public int getAbsis() {
		return absis;
	}
	
	/**
	 * Getter dari data atribut ordinat
	 * @return lokasi ordinat dari cell
	 */
	public int getOrdinat() {
		return ordinat;
	}
	
	/**
	 * Method untuk mencetak isi cell ke layar
	 */
	public void render() {
		System.out.print(type);
	}
}
