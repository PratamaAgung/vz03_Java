package animal;

/**
 * @class MantaRay
 * Kelas MantaRay turunan dari kelas WaterAnimal meng-implement kelas Karnivora
 * @author Iftitakhul Zakiah
 */
public class MantaRay extends WaterAnimal implements Karnivora {
	private int rasio_makanan = 400;
	private String aksi = "Swim! Jump!";

	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public MantaRay(int id, int x, int y, int massa, boolean jinak) {
		super('Q',id);
		super.setMassa(massa);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
		
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi MantaRay ke layar
	 */
	public void interact() {
		System.out.println("MantaRay: (" + aksi + ")");
	}
	/**
	 * implementasi seeMeatType dari kelas Karnivora.
	 */
	public void seeMeatType() {
		System.out.println("MantaRay eats another fish");
	}
}
