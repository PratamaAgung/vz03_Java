package animal;

/**
 * @class Buaya
 * Kelas Buaya turunan dari kelas LandWaterAnimal meng-implement kelas Karnivora
 * @author Iftitakhul Zakiah
 */
public class Buaya extends LandWaterAnimal implements Karnivora {
	private int rasio_makanan = 200;
	private String aksi = "open mouth";

	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public Buaya(int id, int x, int y, int massa, boolean jinak) {
		super('D',id);
		super.setMassa(massa);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
		
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi Buaya ke layar
	 */
	public void interact() {
		System.out.println("Buaya: (" + aksi + ")");
	}
	/**
	 * implementasi seeMeatType dari kelas Karnivora.
	 */
	public void seeMeatType() {
		System.out.println("Buaya eats any kinds of meat");
	}
}