package animal;

/**
 * @class HiuMartil
 * Kelas HiuMartil turunan dari kelas WaterAnimal meng-implement kelas Karnivora
 * @author Iftitakhul Zakiah
 */
public class HiuMartil extends WaterAnimal implements Karnivora {
	private int rasio_makanan = 100;
	private String aksi = "move head";

	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public HiuMartil(int id, int x, int y, int massa, boolean jinak) {
		super('T',id);
		super.setMassa(massa);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
		
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi HiuMartil ke layar
	 */
	public void interact() {
		System.out.println("HiuMartil: (" + aksi + ")");
	}
	/**
	 * implementasi seeMeatType dari kelas Karnivora.
	 */
	public void seeMeatType() {
		System.out.println("HiuMartil eats another fish");
	}
}
