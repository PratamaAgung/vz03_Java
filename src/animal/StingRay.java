package animal;

/**
 * @class StingRay
 * Kelas StingRay turunan dari kelas WaterAnimal meng-implement kelas Karnivora
 * @author Iftitakhul Zakiah
 */
public class StingRay extends WaterAnimal implements Karnivora {
	private int rasio_makanan = 10;
	private String aksi = "move fin";

	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public StingRay(int id, int x, int y, int massa, boolean jinak) {
		super('Y',id);
		super.setMassa(massa);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
		
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi StingRay ke layar
	 */
	public void interact() {
		System.out.println("StingRay: (" + aksi + ")");
	}
	/**
	 * implementasi seeMeatType dari kelas Karnivora.
	 */
	public void seeMeatType() {
		System.out.println("StingRay eats another fish");
	}
}
