package animal;

/** 
 * @class WaterAnimal turunan dari kelas Animal 
 * menunjukkan animal yang tinggal di air
 * @author Iftitakhul Zakiah
 */
public abstract class WaterAnimal extends Animal {
	/**
	 * Contsructor
	 * @param inisial inisial dari animal yang diciptakan
	 * @param id id animal yang diciptakan
	 */
	public WaterAnimal(char inisial, int id) {
		super(inisial,id);
		super.addHabitat('x');
	}
}