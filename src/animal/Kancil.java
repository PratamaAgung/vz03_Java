package animal;

/**
 * @class Kancil turunan dari LandAnimal dan implement Herbivora
 * @author Annisa Muzdalifa
 */
public class Kancil extends LandAnimal implements Herbivora {
	private String aksi = "eat cucumber";
	private int rasio_makanan = 2;
	
	/**
	 * Constructor
	 * @param id id dari animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam gram
	 * @param jinak sifat animal apakah jinak atau tidak
	 */
	public Kancil(int id, int x, int y, int massa, boolean jinak) {
		super('K', id);
		super.setMakanan(massa/rasio_makanan);
		super.setMassa(massa);
		super.setJinak(jinak);
		super.setX(x);
		super.setY(y);
	}
	/**
	 * Menampilkan interaksi berupa suara animal ke layar
	 */
	public void interact() {
		System.out.println("Kancil: (" + aksi + ")");
	}
	/**
	 * Menampilkan makanan dari animal
	 */
	public void getTypeFood() {
		System.out.println("Kancil eats grass");
	}
	

}
