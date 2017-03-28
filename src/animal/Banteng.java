package animal;

/**
 * @class Banteng turunan LandAnimal dan implement Herbivora
 * @author Annisa Muzdalifa
 */
public class Banteng extends LandAnimal implements Herbivora {
	private int rasio_makanan = 100;
	private String aksi = "snort";
	
	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public Banteng(int id, int x, int y, int massa, boolean jinak) {
		super('A',id);
		super.setMakanan(massa/rasio_makanan);
		super.setMassa(massa);
		super.setJinak(jinak);
		super.setX(x);
		super.setY(y);
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi Badak ke layar
	 */
	public void interact() {
		System.out.println("Banteng: (" + aksi + ")");
	}
	/**
	 * implementasi getTypeFood dari kelas Herbivore.
	 */
	public void seeVeggieType() {
		System.out.println("Banteng eats grass");
	}
}
