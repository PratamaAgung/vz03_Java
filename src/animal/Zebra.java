package animal;

/**
 * @class Zebra turunan LandAnimal dan implement Herbivora
 * @author Annisa Muzdalifa
 */
public class Zebra extends LandAnimal implements Herbivora {
	private String aksi = "running";
	private int rasio_makanan = 60;
	
	/**
	 * Constructor
	 * @param id id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam gram
	 * @param jinak sifat animal apakah jinak atau tidak
	 */
	public Zebra(int id, int x, int y, int massa, boolean jinak) {
		super('Z', id);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
	}
	/**
	 * Menampilkan interaksi berupa suara animal ke layar
	 */
	public void interact() {
		System.out.println("Zebra: (" + aksi + ")");
	}
	/**
	 * Menampilkan makanan dari animal
	 */
	public void seeVeggieType() {
		System.out.println("Zebra eats grass");
	}

}
