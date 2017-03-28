package animal;

;

/** 
 * @class Bekantan
 * Kelas Bekantan turunan dari kelas LandAnimal meng-implement kelas Omnivora
 * @author Annisa Muzdalifa 
 */
public class Bekantan extends LandAnimal implements Omnivora {
	private int rasio_makanan = 10;
	private String aksi = "climb tree";

	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public Bekantan(int id, int x, int y, int massa, boolean jinak) {
		super('B',id);
		super.setMassa(massa);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
		
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi Bekantan ke layar
	 */
	public void interact() {
		System.out.println("Bekantan: (" + aksi + ")");
	}
	/**
	 * implementasi getTypeFood dari kelas Omnivore.
	 */
	public void getTypeFood() {
		System.out.println("Bekantan eats vegetable and meat");
	}
}
