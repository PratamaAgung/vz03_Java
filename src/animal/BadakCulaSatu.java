package animal;

/** 
 * @class BadakCulaSatu
 * Kelas BadakCulaSatu turunan dari kelas LandAnimal meng-implement kelas Herbivora
 * @author Annisa Muzdalifa 
 */
public class BadakCulaSatu extends LandAnimal implements Herbivora {
	private int rasio_makanan = 250;
	private String aksi = "bathing in mud";

	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public BadakCulaSatu(int id, int x, int y, int massa, boolean jinak) {
		super('C',id);
		super.setMassa(massa);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
		
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi Badak ke layar
	 */
	public void interact() {
		System.out.println("BadakCulaSatu: (" + aksi + ")");
	}
	/**
	 * implementasi getTypeFood dari kelas Herbivore.
	 */
	public void seeVeggieType() {
		System.out.println("BadakCulaSatu eats grass");
	}
}