/**
 * 
 */
package animal;

/**
 * @class Garuda
 * Kelas Garuda turunan dari kelas FlyingAnimal meng-implement kelas Karnivora
 * @author Iftitakhul Zakiah
 */
public class Garuda extends FlyingAnimal implements Karnivora {
	private int rasio_makanan = 6;
	private String aksi = "spread wings, wuusshh!";

	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public Garuda(int id, int x, int y, int massa, boolean jinak) {
		super('G',id);
		super.setMassa(massa);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
		
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi Garuda ke layar
	 */
	public void interact() {
		System.out.println("Garuda: (" + aksi + ")");
	}
	/**
	 * implementasi seeMeatType dari kelas Karnivora.
	 */
	public void seeMeatType() {
		System.out.println("Garuda eats snake and another meat");
	}
}
