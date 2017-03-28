package animal;

/**
 * @class Elang
 * Kelas Elang turunan dari kelas FlyingAnimal meng-implement kelas Karnivora
 * @author Iftitakhul Zakiah
 */
public class Elang extends FlyingAnimal implements Karnivora {
	private int rasio_makanan = 5;
	private String aksi = "Kaaaak!";

	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public Elang(int id, int x, int y, int massa, boolean jinak) {
		super('~',id);
		super.setMassa(massa);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
		
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi Elang ke layar
	 */
	public void interact() {
		System.out.println("Elang: (" + aksi + ")");
	}
	/**
	 * implementasi seeMeatType dari kelas Karnivora.
	 */
	public void seeMeatType() {
		System.out.println("Elang eats snake and another meat");
	}
}