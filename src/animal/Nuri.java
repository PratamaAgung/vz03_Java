/**
 * 
 */
package animal;

/**
 * @class Nuri
 * Kelas Nuri turunan dari kelas FlyingAnimal meng-implement kelas Herbivora
 * @author Iftitakhul Zakiah
 */
public class Nuri extends FlyingAnimal implements Herbivora {
	private int rasio_makanan = 2;
	private String aksi = "play ball";

	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public Nuri(int id, int x, int y, int massa, boolean jinak) {
		super('N',id);
		super.setMassa(massa);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
		
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi Nuri ke layar
	 */
	public void interact() {
		System.out.println("Nuri: (" + aksi + ")");
	}
	/**
	 * implementasi seeVeggieType dari kelas Herbivora.
	 */
	public void seeVeggieType() {
		System.out.println("Nuri eats any kind of seed");
	}
}
