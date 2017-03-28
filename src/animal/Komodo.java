package animal;

/**
 * @class Komodo turunan LandAnimal dan implement Karnivora
 * @author nim_13515090
 *
 */
public class Komodo extends LandAnimal implements Karnivora {
	private String aksi = "stick tongue";
	private int rasio_makanan = 10;
	
	/**
	 * Constructor
	 * @param id id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam gram
	 * @param jinak sifat animal apakah jinak atau tidak
	 */
	public Komodo(int id, int x, int y, int massa, boolean jinak) {
		super('J', id);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
	}
	/**
	 * Menampilkan interaksi berupa suara animal ke layar
	 */
	public void interact() {
		System.out.println("Komodo: (" + aksi + ")");
	}
	/**
	 * Menampilkan makanan dari animal
	 */
	public void getTypeFood() {
		System.out.println("Komodo eats meat");
	}

}
